package com.springcore.SpringCoreConcepts.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    //@Qualifier("dog")

     Animal animal;
     Student student;

     @Autowired
     Samosa samosa;

    @Autowired()
    public Person(Animal animal,Student student) {
        this.animal = animal;
        this.student = student;

    }

    public void playWithAnimal(){
        animal.play();
        student.detail();
        samosa.eat();
    }
}
