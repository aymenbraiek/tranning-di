package com.springframework.di.tranningdi.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements  GreetingService{
    @Override
    public String sayGretting() {
        System.out.println("hello Di");
        return  " hello amine";
    }

    @Override
    public String getProductById() {
        return "hello amine";
    }
}
