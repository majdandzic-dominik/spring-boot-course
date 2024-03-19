package com.dmajd.springcoredemo.common;

public class SwimCoach implements Coach
{
    public SwimCoach()
    {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkou()
    {
        return "Swim 10 laps";
    }
}
