package com.springdemo.inter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach=context.getBean("fcoach",Coach.class);
		
		
		//call methods on the bean
		System.err.println(theCoach.getWorkout());
		
		
		//close the context
		context.close();
		
	}

}
