package com.nimo.service;

import org.springframework.stereotype.Component;

@Component
public class IHelloServiceHystric implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "sorry "+ name;
    }
}
