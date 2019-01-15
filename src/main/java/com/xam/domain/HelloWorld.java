package com.xam.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    public static final String HELLO_MSG = "Hello World!!!!";
    public String quote;
    public String getQuote() {
        return quote;
    }
    public HelloWorld() {

    }
    @Autowired
    public HelloWorld(@Value("Where there is a way, there is a will.")String quote) {
        this.quote = quote;
    }
    public String getMessage() {
        return HELLO_MSG;
    }
}
