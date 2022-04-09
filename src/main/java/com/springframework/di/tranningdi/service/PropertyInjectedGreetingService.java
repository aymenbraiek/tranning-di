package com.springframework.di.tranningdi.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGretting() {
        System.out.println("injected by Property");
        return "hello";
    }

    @Override
    public String getProductById() {
        return null;
    }
}
