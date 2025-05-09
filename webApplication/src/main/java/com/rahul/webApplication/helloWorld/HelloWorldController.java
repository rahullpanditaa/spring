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

    @RequestMapping("hello-html")
    @ResponseBody // this annotation tells spring to write the return values directly to the http response body
    // instead of resolving it as the name of a view to be rendered
    public String helloHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html>");
        stringBuilder.append("<head>");
        stringBuilder.append("<title>Practice Page</title>");
        stringBuilder.append("</head>");
        stringBuilder.append("<body>");
        stringBuilder.append("<h1>Welcome to My Page</h1>");
        stringBuilder.append("<p>This is a paragraph of text for testing purposes.</p>");
        stringBuilder.append("<p>Writing return value (in this case, some html) directly to http response body.</p>");
        stringBuilder.append("</body>");
        stringBuilder.append("</html>");
        return stringBuilder.toString();
    }

    // using JSP to return a view
    @RequestMapping("hello-html-jsp")
    public String helloHtmlJsp() {
        return "hello";  // this will be resolved as a view name (hello.jsp)
    }
}
