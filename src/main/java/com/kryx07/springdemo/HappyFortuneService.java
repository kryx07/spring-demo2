package com.kryx07.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    public String getDailyFortune() {
        return "Today is your lucky day";
    }
}
