package com.kryx07.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "Do Tennis workout";
    }

    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
