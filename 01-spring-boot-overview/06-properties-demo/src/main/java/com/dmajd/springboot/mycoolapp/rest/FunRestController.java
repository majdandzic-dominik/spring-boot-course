package com.dmajd.springboot.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController
{
    // inject properties

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose "/" that return "teaminfo"

    @GetMapping("/teaminfo")
    public String getTeamInfo()
    {
        return "Coach: " + coachName + ", Team: " + teamName;
    }

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello()
    {
        return "Hello World";
    }

    // expose "/" that return "workout"

    @GetMapping("/workout")
    public String getDailyWorkout()
    {
        return "Run 5k";
    }

    // expose "/" that return "fortune"

    @GetMapping("/fortune")
    public String getDailyFortune()
    {
        return "Unlucky";
    }
}
