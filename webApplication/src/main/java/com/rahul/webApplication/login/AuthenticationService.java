package com.rahul.webApplication.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String userName, String password) {
        return userName.equalsIgnoreCase("razumikhin") && password.equalsIgnoreCase("dunechka");
    }
}
