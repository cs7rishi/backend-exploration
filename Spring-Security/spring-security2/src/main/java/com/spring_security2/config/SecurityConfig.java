package com.spring_security2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
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
//     * Deny All request
//     * As part of authorization the frontend would ask for credentials but would fail eventually
//     */
//    @Bean
//    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests((requests) -> {
//                requests.anyRequest().denyAll();
//            })
//            .formLogin(Customizer.withDefaults())
//            .httpBasic(Customizer.withDefaults());
//
//        return (SecurityFilterChain) http.build();
//    }


//    /**
//     * Allow All requests
//     *
//     */
//    @Bean
//    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests((requests) -> {
//                requests.anyRequest().permitAll();
//            })
//            .formLogin(Customizer.withDefaults())
//            .httpBasic(Customizer.withDefaults());
//
//        return (SecurityFilterChain) http.build();
//    }




}
