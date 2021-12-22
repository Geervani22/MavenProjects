package com.maven;

public class CustomerBoImp implements CustomerBo {

	@Override
	public void addCustomer() {
		// TODO Auto-generated method stub
		System.out.println("Add customer() is running");
	}

	@Override
	public String addCustomerReturnValue() {
		// TODO Auto-generated method stub
		System.out.println("Addcustomerreturnvalue() is running");
		return "abc";
	}

	@Override
	public void addCustomerThrowException() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCustomerAround(String name) {
		// TODO Auto-generated method stub
		System.out.println("running");
	}

}
