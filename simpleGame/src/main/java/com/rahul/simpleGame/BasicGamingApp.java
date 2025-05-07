package com.rahul.simpleGame;

import com.rahul.simpleGame.game.GameRunner;
import com.rahul.simpleGame.game.MarioGame;

public class BasicGamingApp {

    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();

    }
}
