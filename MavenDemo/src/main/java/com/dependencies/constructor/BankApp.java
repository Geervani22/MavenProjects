package com.dependencies.constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext con= new AnnotationConfigApplicationContext(AppConfig.class);
		Manager obj= con.getBean(Manager.class);
		obj.callMeeting();
		con.close();
		
		
	}

}
