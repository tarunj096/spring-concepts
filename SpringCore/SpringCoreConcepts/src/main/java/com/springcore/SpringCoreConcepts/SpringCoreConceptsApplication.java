package com.springcore.SpringCoreConcepts;

import com.springcore.SpringCoreConcepts.couple.*;
import com.springcore.SpringCoreConcepts.scope.Pepsi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import test.Test;

@SpringBootApplication
//@ComponentScan(basePackages = )
@ComponentScan(basePackages = {"com.springcore.SpringCoreConcepts","test"})
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {
		// About the Beans

		//About the dependencies

		//Where to scan for beans	- com.springcore.SpringCoreConcepts.couple

//		Animal an = new Cat();
//		Person p = new Person(an);
//		p.playWithAnimal();
		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
//		Person personBean = context.getBean(Person.class);
//		personBean.playWithAnimal();
//		System.out.println(personBean);
//		Test testBean = context.getBean(Test.class);
//		testBean.testing();
//		Animal cat = context.getBean("cat", Animal.class);
//		cat.play();
		Pepsi bean = context.getBean(Pepsi.class);
		System.out.println(bean);
		bean.drink();

	}

	//declaring bean using @Bean

	@Bean
	public Samosa getSamosa(){
		return new Samosa();
	}

}
