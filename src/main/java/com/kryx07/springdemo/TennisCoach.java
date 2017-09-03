package com.kryx07.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("coach")
public class TennisCoach implements Coach {
    public String getDailyWorkout() {
        return "Do Tennis workout";
    }

    public String getDailyFortune() {
        return null;
    }
}
