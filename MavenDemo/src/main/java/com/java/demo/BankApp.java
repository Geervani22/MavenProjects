package com.java.demo;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {
//private static ApplicationContext context;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Manager employee = context.getBean(Manager.class);
		employee.dowork();
		Accountant accountant = context.getBean(Accountant.class);
		accountant.dowork();
		context.close();
	}

}
