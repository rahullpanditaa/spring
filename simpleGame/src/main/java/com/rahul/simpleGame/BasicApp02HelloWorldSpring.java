package com.rahul.simpleGame;

import com.rahul.simpleGame.config.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasicApp02HelloWorldSpring {

    public static void main(String[] args) {
        // 1. Launch a Spring application context
        // 2. configure the things that i want the Spring framework to manage - a configuration class

        // creates an application context/spring context - argument is the configuration class used to define beans
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // using method name (bean id) to get the bean it returns - retrieving beans managed by spring
        System.out.println(context.getBean("name") + " is " + context.getBean("age") + " years old.");

        System.out.println(context.getBean("person1"));
        System.out.println(context.getBean("address"));

    }
}
