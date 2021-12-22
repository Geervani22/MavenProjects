package com.maven;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    ApplicationContext context = new  ClassPathXmlApplicationContext ("demo.xml");
    
  /*  Helloworld obj= (Helloworld)context.getBean("hello");//pass the bean  id
    obj.printHello();
   Emp obj2= (Emp)context.getBean("emp");
   obj2.printInfo();*/

	
	
   CustomerBo bo = (CustomerBo) context.getBean("cust");
   bo.addCustomer();

  }
}
