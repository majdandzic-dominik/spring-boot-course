package com.dmajd.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach
{
    @Override
    public String getDailyWorkou()
    {
        return "Practice fast bowling for 15 minutes";
    }
}
