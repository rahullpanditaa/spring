package com.rahul.simpleGame.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    // THE OBJECT RETURNED BY THE METHOD (IN THIS CASE, STRING) IS THE BEAN
    // THE METHOD ITSELF IS NOT A BEAN. IT IS A BEAN ID
    @Bean
    public String name() {
        return "Chintu";
    }
}
