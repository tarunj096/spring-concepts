package com.springcore.SpringCoreConcepts;

import com.springcore.SpringCoreConcepts.couple.*;
import com.springcore.SpringCoreConcepts.scope.Pepsi;
import com.springcore.SpringCoreConcepts.scope.Soda;
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
//		Pepsi bean = context.getBean(Pepsi.class);
//		System.out.println(bean);
//		bean.drink();
//
//		Pepsi bean1 = context.getBean(Pepsi.class);
//		System.out.println(bean1);
//
//		Pepsi bean2 = context.getBean(Pepsi.class);
//		System.out.println(bean2);

//		Pepsi pepsi = context.getBean(Pepsi.class);
//		System.out.println(pepsi);
//		Soda soda = pepsi.getSoda();
//		System.out.println(soda);
//
//		Pepsi pepsi1 = context.getBean(Pepsi.class);
//		System.out.println(pepsi1);
//		Soda soda1 = pepsi1.getSoda();
//		System.out.println(soda1);


	}

	//declaring bean using @Bean

	@Bean
	public Samosa getSamosa(){
		return new Samosa();
	}

}
