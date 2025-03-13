package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Emp;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Emp e=ctx.getBean("e1", Emp.class);
		System.out.println("using application context e="+e);
		
		e=ctx.getBean("e2",Emp.class);
		System.out.println("e="+e);
		
		
	}

}
