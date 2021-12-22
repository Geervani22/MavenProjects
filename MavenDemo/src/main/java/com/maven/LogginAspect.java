package com.maven;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class LogginAspect {
	

	@Before("execution(* com.maven.demo1.CustomerBo.addCustomer())")
	public void logBefore(Joinpoint join) throws Throwable {
		System.out.println(" Lofbefore is running ");
		//System.out.println("hijacked method : " + ((Object) join).getSignature().getName());
		System.out.println("***************");
	
		
	}
}

/*@Around("execution(* com.maven.demo1.CustomerBo.addCustomerAround(..))")
public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

	System.out.println("logAround() is running!");
	System.out.println("hijacked method : " + joinPoint.getSignature().getName());
	System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
		
	System.out.println("Around before is running!");
	joinPoint.proceed(); //continue on the intercepted method
	System.out.println("Around after is running!");
		
	System.out.println("******");
*/