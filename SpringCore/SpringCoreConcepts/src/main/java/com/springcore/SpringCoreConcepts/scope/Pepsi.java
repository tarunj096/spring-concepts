package com.springcore.SpringCoreConcepts.scope;

import org.springframework.stereotype.Component;

@Component
public class Pepsi {

    public Pepsi(){
        System.out.println("Creating Pepsi...");
    }
    public void drink(){
        System.out.println("Great Pepsi...");
    }
}
