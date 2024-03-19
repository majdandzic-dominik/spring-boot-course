package com.dmajd.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TrackCoach implements Coach
{
    @Override
    public String getDailyWorkou()
    {
        return "Run a 5k";
    }
}
