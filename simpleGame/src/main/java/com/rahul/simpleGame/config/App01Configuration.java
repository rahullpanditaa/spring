package com.rahul.simpleGame.config;

import com.rahul.simpleGame.game.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.rahul.simpleGame.game") // need to tell Spring where to look for the Component
public class App01Configuration {

    // The exact game to be run is a dependency of GameRunner class

//    @Bean(name = "mario")
//    @Qualifier("marioGame")
//    public GamingConsole game1() {
//        return new MarioGame();
//        // Still creating and returning Beans manually using the @Bean annotation
//    }
//
//    @Bean(name = "contra")
//    @Qualifier("contraGame")
//    public GamingConsole game2() {
//        return new ContraGame();
//    }
//
//    @Bean(name = "pacman")
//    @Qualifier("pacmanGame")
//    public GamingConsole game3() {
//        return new PacmanGame();
//    }

    // This bean still has a GamingConsole dependency
    // used @Component annotation with pacman class - spring detects it, automatically creates an instance of it and injects here
    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

}
