package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Question;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext  ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		Question q=ctx.getBean("q1",Question.class);
		System.out.println("collection injection for string base list");
		System.out.println("q="+q);

	}

}
