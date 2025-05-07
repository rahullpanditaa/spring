package com.rahul.simpleGame.game;

public class GameRunner {
//    private MarioGame game;
    private ContraGame game;

    public GameRunner(ContraGame game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Currently running game: " + game);
        game.up();
        game.right();
    }
}
