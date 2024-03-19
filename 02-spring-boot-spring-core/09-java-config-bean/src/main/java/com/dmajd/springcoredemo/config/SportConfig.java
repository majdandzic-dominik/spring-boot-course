package com.dmajd.springcoredemo.config;

import com.dmajd.springcoredemo.common.Coach;
import com.dmajd.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig
{
    @Bean("aqua")
    public Coach swimCoach()
    {
        return new SwimCoach();
    }
}
