package com.spring_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> {
            requests
                .requestMatchers("/myaccount", "/mybalance", "/myloans", "/mycards").authenticated()
                .requestMatchers("/notices", "/contact").permitAll();
        })
            .formLogin(Customizer.withDefaults())
            .httpBasic(Customizer.withDefaults());

        return (SecurityFilterChain) http.build();
    }


//    /**
//     * Approch 1 use withDefaultPasswordEncoder
//     */
//    @Bean
//    public InMemoryUserDetailsManager userDetailsService(){
//        UserDetails admin = User.withDefaultPasswordEncoder()
//            .username("admin")
//            .password("admin")
//            .authorities("admin")
//            .build();
//        UserDetails user = User.withDefaultPasswordEncoder()
//            .username("user")
//            .password("user")
//            .authorities("read")
//            .build();
//
//        return new InMemoryUserDetailsManager(admin,user);
//    }

    /**
     * Approch 2 explicitly defining the password encoder
     */
    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();

        UserDetails admin =
            User.withUsername("admin").password("admin").authorities("admin").build();
        UserDetails user = User.withUsername("user").password("user").authorities("read").build();

        manager.createUser(admin);
        manager.createUser(user);

        return manager;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
