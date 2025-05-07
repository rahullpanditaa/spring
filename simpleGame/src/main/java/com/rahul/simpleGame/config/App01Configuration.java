package com.rahul.simpleGame.config;

import com.rahul.simpleGame.game.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.rahul.simpleGame.game") // need to tell Spring where to look for the Component
public class App01Configuration {


}
