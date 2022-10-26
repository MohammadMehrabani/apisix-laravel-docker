package com.company.project.controllers;

import com.company.project.entity.Greeting;
import com.company.project.repository.GreetingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingRepository repository;

    public GreetingController(GreetingRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/get")
    public String getApisixGreeting() {
        Greeting apisixGreeting = repository.findById(1).orElse(new Greeting("Not Found 😕"));
        return apisixGreeting.getName();
    }

    @GetMapping("/sample-file.csv")
    public String getSampleFile() {
        return "The sample file";
    }
}
