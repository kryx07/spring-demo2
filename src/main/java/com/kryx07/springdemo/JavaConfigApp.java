package com.kryx07.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = applicationContext.getBean("tennisCoach", TennisCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

    }
}
