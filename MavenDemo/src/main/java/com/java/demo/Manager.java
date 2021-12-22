package com.java.demo;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee {

	@Override
	public void dowork() {
		// TODO Auto-generated method stub
System.out.println("Manager is responding");
	}

}
