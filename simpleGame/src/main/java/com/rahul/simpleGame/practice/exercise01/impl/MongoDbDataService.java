package com.rahul.simpleGame.practice.exercise01.impl;

import com.rahul.simpleGame.practice.exercise01.DataService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[]{11, 22, 33, 44, 55};
    }
}
