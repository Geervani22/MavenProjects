package com.dependencies.constructor;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements EmpInterface {

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Accountant is doing work");
	}

	@Override
	public void JobDetails() {
		// TODO Auto-generated method stub
		System.out.println("Accountant handle all the account related data");
	}

	public Accountant() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("inside the Accountant Constructor");
	}

}
