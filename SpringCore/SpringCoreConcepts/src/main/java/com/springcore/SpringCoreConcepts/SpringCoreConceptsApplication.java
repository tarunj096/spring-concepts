package com.springcore.SpringCoreConcepts;

import com.springcore.SpringCoreConcepts.couple.Animal;
import com.springcore.SpringCoreConcepts.couple.Cat;
import com.springcore.SpringCoreConcepts.couple.Dog;
import com.springcore.SpringCoreConcepts.couple.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {
		Animal an = new Cat();
		Person p = new Person(an);
		p.playWithAnimal();
		SpringApplication.run(SpringCoreConceptsApplication.class, args);
	}

}
