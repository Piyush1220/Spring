package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Empy;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		Empy e=ctx.getBean("e1",Empy.class);
		System.out.println("using injection for dependent object");
		System.out.println("e="+e);

	}

}
