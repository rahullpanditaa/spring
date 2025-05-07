package com.rahul.simpleGame;

import com.rahul.simpleGame.game.ContraGame;
import com.rahul.simpleGame.game.GameRunner;
import com.rahul.simpleGame.game.MarioGame;

public class BasicGamingApp {

    public static void main(String[] args) {

        // TIGHT COUPLING
//        var marioGame = new MarioGame();
        var contraGame = new ContraGame();
        var gameRunner = new GameRunner(contraGame);
        gameRunner.run();

    }
}
