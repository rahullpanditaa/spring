package com.rahul.simpleGame.examples.eg01.businessApp;

import org.springframework.stereotype.Component;

@Component
public class BusinessClass {

    private Dependency1 dependency1;
    private Dependency2 dependency2;

    @Override
    public String toString() {
        return "Using " + dependency1 + " and " + dependency2 ;
    }
}
