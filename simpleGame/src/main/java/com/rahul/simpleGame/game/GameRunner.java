package com.rahul.simpleGame.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;

    public GameRunner(@Qualifier("contra") GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Currently running game: " + game);
        game.up();
        game.right();
    }
}
