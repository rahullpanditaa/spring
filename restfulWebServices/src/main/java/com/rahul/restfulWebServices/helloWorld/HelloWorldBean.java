package com.rahul.restfulWebServices.helloWorld;

public class HelloWorldBean {
    private String message;

    public HelloWorldBean(String text) {
        this.message = text;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
