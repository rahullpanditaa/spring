package com.rahul.simpleGame;

import com.rahul.simpleGame.game.GameRunner;
import com.rahul.simpleGame.game.PacmanGame;

public class BasicGamingApp {

    public static void main(String[] args) {

        // (SOMEWHAT) LOOSE COUPLING
//        var game = new MarioGame();
//        var game = new ContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}
