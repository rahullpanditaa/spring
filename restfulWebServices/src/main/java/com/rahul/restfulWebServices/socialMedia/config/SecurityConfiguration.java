package com.rahul.restfulWebServices.socialMedia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        // all incoming requests should be authenticated
        httpSecurity.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());

        // basic auth popup
        httpSecurity.httpBasic(withDefaults());

        //noinspection removal
        httpSecurity.csrf().disable();

        return httpSecurity.build();
    }
}
