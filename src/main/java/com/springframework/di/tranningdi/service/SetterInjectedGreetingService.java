package com.springframework.di.tranningdi.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGretting() {
        System.out.println("injected by Setter");
        return "hello ";
    }

    @Override
    public String getProductById() {
        return null;
    }
}
