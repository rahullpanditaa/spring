package com.rahul.simpleGame.config;

import com.rahul.simpleGame.game.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App01Configuration {

    // The exact game to be run is a dependency of GameRunner class

    @Bean(name = "mario")
    @Qualifier("marioGame")
    public GamingConsole game1() {
        return new MarioGame();
    }

    @Bean(name = "contra")
    @Qualifier("contraGame")
    public GamingConsole game2() {
        return new ContraGame();
    }

    @Bean(name = "pacman")
    @Qualifier("pacmanGame")
    public GamingConsole game3() {
        return new PacmanGame();
    }

    @Bean(name = "game")
    public GameRunner gameRunner(@Qualifier("marioGame") GamingConsole game) {
        return new GameRunner(game);
    }

}
