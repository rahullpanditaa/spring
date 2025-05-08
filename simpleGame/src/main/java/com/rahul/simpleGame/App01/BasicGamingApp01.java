package com.rahul.simpleGame.App01;

import com.rahul.simpleGame.App01.config.App01Configuration;
import com.rahul.simpleGame.App01.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BasicGamingApp01 {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(App01Configuration.class)) {
            context.getBean(GameRunner.class).run();
        }

    }
}
