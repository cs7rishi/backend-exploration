package com.spring_security.config;

import com.spring_security.entities.Customer;
import com.spring_security.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EazyBankUserDetailManager implements UserDetailsService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String email, password;
        List<GrantedAuthority> authorities;
        List<Customer> customerList = customerRepository.findByEmail(username);
        if(customerList.size() == 0)
            throw new UsernameNotFoundException("User detail not found for the user");
        else{
            email = customerList.get(0).getEmail();
            password = customerList.get(0).getPwd();

            authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(customerList.get(0).getRole()));

        }

        return new User(email, password, authorities);
    }
}
