package com.xam.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    @Autowired
    private Message message;

    public static final String HELLO_MSG = "Hello World!!!!";


    public HelloWorld(Message message) {
        System.out.println("Autowired...");
        this.message=message;
    }

    public HelloWorld() {
    }

    public String getMessage() {
        return HELLO_MSG + "at: "+ message.getAuthor();
    }
}
