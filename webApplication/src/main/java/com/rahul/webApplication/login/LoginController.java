package com.rahul.webApplication.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // http://localhost:8080/login?name=rahul
    // name passed to login controller
    // need to tell login controller that this specific method gets a request parameter
    @RequestMapping("/login")
    public String loginPage(@RequestParam String name, ModelMap model) {  // @RequestParam - indicates that a method parameter should be bound to a web request param
        model.put("name", name);
        System.out.println("Request param is: " + name);
        return "login";
    }
}
