package com.spring_security.config;

import com.spring_security.entities.Authority;
import com.spring_security.entities.Customer;
import com.spring_security.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Component
public class EazyBankUserPwsAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication)
        throws AuthenticationException {
        String username = authentication.getName();
        String pwd = authentication.getCredentials().toString();

        List<Customer> customerList = customerRepository.findByEmail(username);
        if (!customerList.isEmpty()) {
            if (passwordEncoder.matches(pwd, customerList.get(0).getPwd())) {
                return new UsernamePasswordAuthenticationToken(username, pwd, getGrantedAuthorties(customerList.get(0).getAuthorities()));
            } else {
                throw new BadCredentialsException("Invalid credential");
            }
        } else {
            throw new BadCredentialsException("No registered user with this detail");
        }
    }

    private List<GrantedAuthority> getGrantedAuthorties(Set<Authority> authoritySet){
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();

        for(Authority authority: authoritySet){
            grantedAuthorities.add(new SimpleGrantedAuthority(authority.getName()));
        }

        return grantedAuthorities;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }
}
