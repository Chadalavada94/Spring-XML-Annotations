package com.love2code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext the = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach= the.getBean("tennisCoach", Coach.class);
		
		Coach theCoach1 = the.getBean("tennisCoach", Coach.class);
		
		
		
		Boolean value = (theCoach==theCoach1);
		
		System.out.println(value);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		the.close();
		

	}

}
