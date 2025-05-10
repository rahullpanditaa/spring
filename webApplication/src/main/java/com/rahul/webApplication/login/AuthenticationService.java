package com.rahul.webApplication.login;

public class AuthenticationService {

    public boolean authenticate(String userName, String password) {
        return userName.equalsIgnoreCase("razumikhin") && password.equalsIgnoreCase("dunechka");
    }
}
