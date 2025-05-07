package com.rahul.simpleGame.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age, Address address) {}
record Address(String city, String state) {}

@Configuration
public class HelloWorldConfiguration {

    // THE OBJECT RETURNED BY THE METHOD (IN THIS CASE, STRING) IS THE BEAN
    // THE METHOD ITSELF IS NOT A BEAN. IT IS A BEAN ID
    @Bean
    public String name() {
        return "Chintu";
    }

    @Bean
    public int age() {
        return 33;
    }

    @Bean
    public int age2() {
        return 44;
    }

    @Bean(name = "idiot")
    public Person person() {
        return new Person("Rahul", 30, new Address("Lokhandwala", "Massachussets"));
    }

    // returning a Bean that depends on pre-existing beans via method calls to predefined bean IDs
    @Bean(name = "personMethodCall")
    public Person person2() {
        return new Person(name(), age(), address());  // name(), age() already existing
    }

    // the parameter names must match pre-defined Bean IDs/methods exactly
    @Bean(name = "personParameters")
    public Person person3(String name, int age, Address address) {  // name, age, address
        return new Person(name, age, address);
    }

    @Bean
    public Address address() {
        return new Address("Gurgaon", "Haryana");
    }

    @Bean
    public Address address2() {
        return new Address("Noida", "Toronto");
    }
}
