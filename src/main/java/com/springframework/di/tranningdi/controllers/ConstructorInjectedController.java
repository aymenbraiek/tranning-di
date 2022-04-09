package com.springframework.di.tranningdi.controllers;

import com.springframework.di.tranningdi.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

   // DI by constructor
    private final GreetingService greetingService;
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // method put

    public String getGreeting(){
        return greetingService.sayGretting();
    }
}
