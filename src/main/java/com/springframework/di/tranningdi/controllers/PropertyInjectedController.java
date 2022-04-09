package com.springframework.di.tranningdi.controllers;

import com.springframework.di.tranningdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    // cal DI
    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingService greetingService;

    // method controller
    public String getGreeting(){
        return greetingService.sayGretting();
    }

    }

