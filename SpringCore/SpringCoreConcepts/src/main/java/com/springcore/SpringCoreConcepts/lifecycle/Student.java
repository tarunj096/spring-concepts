package com.springcore.SpringCoreConcepts.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Student {

    public Student(){
        System.out.println("Creating Student..");
    }

    @PostConstruct
    public void postConstuct(){
        System.out.println("Student bean is created..:created()");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Bye Student bean....");
    }

}
