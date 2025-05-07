package com.rahul.simpleGame;

import com.rahul.simpleGame.config.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasicApp02HelloWorldSpring {

    public static void main(String[] args) {
        // 1. Launch a Spring application context
        // creates an application context/spring context - argument is the configuration class used to define beans
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // 2. configure the things that i want the Spring framework to manage - a configuration class
    }
}
