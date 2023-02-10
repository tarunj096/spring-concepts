package com.springcore.SpringCoreConcepts.couple;

import org.springframework.stereotype.Component;

@Component("student5")
public class Student {
    public Student(){
        System.out.println("Calling student");
    }
    public void detail(){
        System.out.println("Student details...");
    }
}
