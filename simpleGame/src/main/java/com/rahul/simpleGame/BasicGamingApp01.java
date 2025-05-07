package com.rahul.simpleGame;

import com.rahul.simpleGame.config.App01Configuration;
import com.rahul.simpleGame.game.GameRunner;
import com.rahul.simpleGame.game.GamingConsole;
import com.rahul.simpleGame.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


public class BasicGamingApp01 {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(App01Configuration.class)) {
            context.getBean(GameRunner.class).run();
        }

    }
}
