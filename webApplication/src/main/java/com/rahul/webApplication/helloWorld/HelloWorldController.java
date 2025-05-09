package com.rahul.webApplication.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {

    // request to this api endpoint will result
    // in this method being called
    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }
}
