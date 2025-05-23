package com.rahul.simpleGame.App01.game;

import org.springframework.stereotype.Component;

@Component("mario")
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
