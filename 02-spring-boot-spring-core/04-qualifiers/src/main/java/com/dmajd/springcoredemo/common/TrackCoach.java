package com.dmajd.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach
{
    @Override
    public String getDailyWorkou()
    {
        return "Run a 5k";
    }
}
