package com.dmajd.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach
{
    @Override
    public String getDailyWorkou()
    {
        return "Spend 30 minutes batting";
    }
}
