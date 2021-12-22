package com.bean.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class Manager implements Employee, InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("performs task while destorying beans");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("performs tasks while initlizing beans");
	}

	@Override
	public void dowork() {
		// TODO Auto-generated method stub
		System.out.println("Employee do their work assigned by manager or employee");
	}

}
