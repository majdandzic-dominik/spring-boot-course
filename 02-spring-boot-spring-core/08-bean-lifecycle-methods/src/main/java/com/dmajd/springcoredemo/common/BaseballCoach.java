package com.dmajd.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach
{
    public BaseballCoach()
    {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkou()
    {
        return "Spend 30 minutes batting";
    }
}
