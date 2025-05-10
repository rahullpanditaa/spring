package com.rahul.webApplication.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    // only use this method for a GET request (displaying the login page)
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        model.put("name", name);
        model.put("password", password);

        // authentication logic
        // name - razumikhin
        // password - dunechka
        var authService = authenticationService.authenticate(name,password); // boolean value
//        return authService ? "welcome" : "login";
        if (authService) {
            return "welcome";
        }
        model.put("errorMessage", "Invalid Credentials. Please try again");
        return "login";
    }
}
