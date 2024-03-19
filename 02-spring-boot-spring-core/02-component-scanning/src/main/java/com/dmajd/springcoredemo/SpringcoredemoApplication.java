package com.dmajd.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication(
        scanBasePackages = {
                "com.dmajd.springcoredemo",
                "com.dmajd.util"
        }
)
 */
@SpringBootApplication
public class SpringcoredemoApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringcoredemoApplication.class, args);
    }

}
