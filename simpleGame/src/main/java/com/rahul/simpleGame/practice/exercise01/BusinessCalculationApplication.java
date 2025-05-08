package com.rahul.simpleGame.practice.exercise01;

import com.rahul.simpleGame.practice.exercise01.config.BusinessCalculationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BusinessCalculationApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BusinessCalculationConfig.class)) {
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());

        }
    }
}
