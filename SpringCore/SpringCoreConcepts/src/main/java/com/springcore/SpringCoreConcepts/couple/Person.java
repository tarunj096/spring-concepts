package com.springcore.SpringCoreConcepts.couple;

public class Person {
    Animal animal;

    public Person(Animal animal) {
        this.animal = animal;
    }

    public void playWithAnimal(){
        animal.play();
    }
}
