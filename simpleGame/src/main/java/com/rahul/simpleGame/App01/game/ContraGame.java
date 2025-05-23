package com.rahul.simpleGame.App01.game;

import org.springframework.stereotype.Component;

@Component("contra")
public class ContraGame implements GamingConsole {

    public void up() {
        System.out.println("Jump!");
    }

    public void down() {
        System.out.println("Look down!");
    }

    public void left() {
        System.out.println("Go back!");
    }

    public void right() {
        System.out.println("Fire!");
    }

    @Override
    public String toString() {
        return "Contra";
    }
}
