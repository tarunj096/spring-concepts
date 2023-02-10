package com.springcore.SpringCoreConcepts.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Another way of defining the scope
public class Pepsi {

    @Autowired
    private Soda soda;

    public Soda getSoda() {
        return soda;
    }

    public void setSoda(Soda soda) {
        this.soda = soda;
    }

    public Pepsi(){
        System.out.println("Creating Pepsi...");
    }
    public void drink(){
        System.out.println("Great Pepsi...");
    }
}
