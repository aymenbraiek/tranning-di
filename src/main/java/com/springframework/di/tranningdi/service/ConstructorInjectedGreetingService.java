package com.springframework.di.tranningdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService  implements GreetingService{
    @Override
    public String sayGretting() {
        System.out.println("injected by constructor ");
        return "hello ";
    }

    @Override
    public String getProductById() {
        return null;
    }
}
