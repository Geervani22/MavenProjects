package com.annotatio.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class BankApp {
private static ApplicationContext context;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("Annotation.xml");
		Employee e= (Employee) context.getBean("manager");
		e.doWork();
		
	//Employee e1= (Employee) context.getBean("account");
	//e1.doWork();
	}
/* @Configuration
@ComponentScan("com.annotation.demo")
public class AppConfig {
	
}
bank//
public class BankApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Manager employee = context.getBean(Manager.class);
		employee.doWork();
		context.close();
	}
}

*/
}
