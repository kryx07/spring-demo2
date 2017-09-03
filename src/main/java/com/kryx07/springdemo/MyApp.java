package com.kryx07.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        Coach theCoach = new TrackCoach();

        System.out.println(theCoach.getDailyWorkout());
    }
}
