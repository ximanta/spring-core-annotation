package com.xam;

import com.xam.config.AppConfig;
import com.xam.domain.HelloWorld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        //Method 1
        //ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        //Method 2
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");

        System.out.println(helloWorld.getMessage());
    }
}
