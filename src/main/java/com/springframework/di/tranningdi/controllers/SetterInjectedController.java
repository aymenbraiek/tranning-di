package com.springframework.di.tranningdi.controllers;

import com.springframework.di.tranningdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    //DI WITH SETTER
    private GreetingService greetingService;

     @Autowired
    public void SetGreetingService(@Qualifier("setterInjectedGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }


    // method PUt
    public String getGreeting(){
        return greetingService.sayGretting();
    }

}
