package com.rahul.webApplication.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
public class HelloWorldController {

    // request to this api endpoint will result
    // in this method being called
    // @ResponseBody tells spring to write the return value directly to http response body
    // instead of resolving it as a view name
    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }

    // returning an html VIEW
    @RequestMapping("hello-html")
    public String helloHtmlJsp() {
        return "hello";  // this will be resolved as a view name (hello.jsp)
    }
}
