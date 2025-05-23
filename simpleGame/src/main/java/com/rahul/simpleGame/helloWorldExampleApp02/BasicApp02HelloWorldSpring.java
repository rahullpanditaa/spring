package com.rahul.simpleGame.helloWorldExampleApp02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasicApp02HelloWorldSpring {

    public static void main(String[] args) {
        // 1. Launch a Spring application context
        // 2. configure the things that i want the Spring framework to manage - a configuration class

        // creates an application context/spring context - argument is the configuration class used to define beans
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // using method name (bean id) to get the bean it returns - retrieving beans managed by spring
            System.out.println(context.getBean("name") + " is " + context.getBean(Integer.class) + " years old.");

//        System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address"));
            System.out.println(context.getBean("idiot")); // using a custom bean ID instead of the method name

            // will throw an error
            // 2 different beans returned are of type Integer
            // make one bean @Primary
            System.out.println(context.getBean(Integer.class)); // using the type of bean returned instead of bean id to retrieve the bean

            System.out.println(context.getBean("personMethodCall"));

            System.out.println(context.getBean("personParameters"));

//        System.out.println(context.getBean());

            // viewing all the beans currently managed by Spring and the IOC Container
            for (String bean : context.getBeanDefinitionNames()) {
                System.out.println(bean);
            }

        }






    }
}
