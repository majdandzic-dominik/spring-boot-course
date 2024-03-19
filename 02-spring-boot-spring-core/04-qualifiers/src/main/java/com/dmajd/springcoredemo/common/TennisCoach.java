package com.dmajd.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{
    @Override
    public String getDailyWorkou()
    {
        return "Practice backhand";
    }
}
