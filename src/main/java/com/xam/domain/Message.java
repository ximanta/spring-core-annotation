package com.xam.domain;

import org.springframework.stereotype.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Component
public class Message {
    public String getAuthor(){
               return "Xam";
    }
}
