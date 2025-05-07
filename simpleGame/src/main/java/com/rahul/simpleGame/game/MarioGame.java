package com.rahul.simpleGame.game;

import org.springframework.stereotype.Component;

//@Component
public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("Jump!");
    }

    public void down() {
        System.out.println("Duck!");
    }

    public void left() {
        System.out.println("Go back!");
    }

    public void right() {
        System.out.println("Go forward!");
    }

    @Override
    public String toString() {
        return "Mario";
    }
}
