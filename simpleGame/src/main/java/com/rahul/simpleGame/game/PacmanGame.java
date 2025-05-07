package com.rahul.simpleGame.game;

public class PacmanGame implements GamingConsole {

    public void up() {
        System.out.println("⬆️");
    }

    public void down() {
        System.out.println("⬇️");
    }

    @Override
    public void left() {
        System.out.println("⬅️");
    }

    @Override
    public void right() {
        System.out.println("➡️");
    }
}
