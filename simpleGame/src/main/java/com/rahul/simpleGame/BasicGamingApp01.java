package com.rahul.simpleGame;

import com.rahul.simpleGame.config.App01Configuration;
import com.rahul.simpleGame.game.GameRunner;
import com.rahul.simpleGame.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasicGamingApp01 {

    public static void main(String[] args) {
//        var game = new PacmanGame();
//        var gameRunner = new GameRunner(game);
//        gameRunner.run();

        try (var context = new AnnotationConfigApplicationContext(App01Configuration.class)) {
            System.out.println(context.getBean("mario"));
        }

    }
}
