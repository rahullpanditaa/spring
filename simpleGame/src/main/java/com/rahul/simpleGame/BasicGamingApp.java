package com.rahul.simpleGame;

import com.rahul.simpleGame.game.GameRunner;
import com.rahul.simpleGame.game.PacmanGame;

public class BasicGamingApp {

    public static void main(String[] args) {

        // (SOMEWHAT) LOOSE COUPLING
//        var game = new MarioGame();
//        var game = new ContraGame();

        // right now,
        var game = new PacmanGame();  // creating an object / instance of specific class
        var gameRunner = new GameRunner(game); // creating an instance of GameRunner PLUS MANUALLY INJECTING A DEPENDENCY
        // the game to be run is a DEPENDENCY of the GameRunner class
        // instead of creating objects and injecting them wherever they are a dependency, give this responsibility to SPRING
        gameRunner.run();

    }
}
