package com.spring_security2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
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

    @Bean
    public InMemoryUserDetailsManager userDetailsService(){

        /**
         * Approch 1 use withDefaultPasswordEncoder
         */
        UserDetails admin = User.withDefaultPasswordEncoder()
            .username("admin")
            .password("admin")
            .authorities("admin")
            .build();
        UserDetails user = User.withDefaultPasswordEncoder()
            .username("user")
            .password("user")
            .authorities("read")
            .build();

        return new InMemoryUserDetailsManager(admin,user);
    }
}
