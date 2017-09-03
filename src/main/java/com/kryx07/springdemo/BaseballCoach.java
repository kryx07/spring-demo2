package com.kryx07.springdemo;

public class BaseballCoach implements Coach {


    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    public String getDailyFortune() {
        return "Today is your lucky day";
    }



    /*@Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }*/
}
