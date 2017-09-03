package com.kryx07.springdemo;

public class CricketCoach implements Coach {


    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }



    /*@Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }*/
}
