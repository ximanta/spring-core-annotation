package com.xam.config;


import com.xam.domain.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {
    @Bean(name = "helloWorld")
    public HelloWorld getHelloWorldBean(){
        return new HelloWorld();
    }
}
