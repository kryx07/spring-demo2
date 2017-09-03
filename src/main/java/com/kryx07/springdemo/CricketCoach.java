package com.kryx07.springdemo;

public class CricketCoach implements Coach {

    private String email;
    private  String team;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

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

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

/*@Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }*/
}
