package com.rahul.simpleGame.examples.eg01;

import com.rahul.simpleGame.examples.eg01.businessApp.BusinessClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTypes {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DepInjectConfig.class)) {
            for (String bean : context.getBeanDefinitionNames()) {
                System.out.println(bean);
            }
            System.out.println(context.getBean(BusinessClass.class).toString());
        }
    }
}
