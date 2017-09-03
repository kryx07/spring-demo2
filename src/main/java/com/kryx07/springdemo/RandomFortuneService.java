package com.kryx07.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
    public String getDailyFortune() {
        return "Random: Today is your lucky day";
    }
}
