package com.rahul.simpleGame.examples.eg01.businessApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessClass {

    @Autowired
    private Dependency1 dependency1;

    @Autowired
    private Dependency2 dependency2;

    @Override
    public String toString() {
        return "Using " + dependency1 + " and " + dependency2 ;
    }
}
