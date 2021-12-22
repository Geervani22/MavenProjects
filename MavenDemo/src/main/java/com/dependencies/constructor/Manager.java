package com.dependencies.constructor;

import org.springframework.stereotype.Component;

@Component
public class Manager implements EmpInterface {
Accountant acc;
	public Manager(Accountant acc) {
	super();
	System.out.println("Manager Constructor ");
	this.acc = acc;
}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Manger is doing work");
	}

	@Override
	public void JobDetails() {
		// TODO Auto-generated method stub
		System.out.println("Manager will manage  respective departments");
	}
public void callMeeting() {
	acc.doWork();
	acc.JobDetails();
}
}
