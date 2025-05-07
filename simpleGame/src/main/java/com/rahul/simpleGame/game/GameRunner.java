package com.rahul.simpleGame.game;

import org.springframework.stereotype.Component;

//@Component
public class GameRunner {
//    private MarioGame game;
//    private ContraGame game;
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Currently running game: " + game);
        game.up();
        game.right();
    }
}
