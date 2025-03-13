package com.spring.client;


import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Book;
import com.spring.model.BookDao;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String ans="";
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		BookDao dao=ctx.getBean("dao",BookDao.class);
		
		do
		{
			System.out.println("Menu\n1)Save Book\n2)Update Book\n3)"
					+ "Delete Book\n4)Show ALL");
			System.out.println("Enter Ur Choice");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:System.out.println("enter Book Id");
					int i=sc.nextInt();
					System.out.println("enter Book Name");
					sc.nextLine();
					String nm=sc.nextLine();
					System.out.println("enter Book Author");
					String au=sc.nextLine();
					System.out.println("enter Book Price");
					double p=sc.nextDouble();
					
					Book obj=new Book(i, nm, au, p);
					int r=dao.saveBook(obj);
					if(r>0)
						System.out.println("Record Inserted...");
				break;
				
			case 2:
				System.out.println("enter Book Id where data tobe Update");
				 i=sc.nextInt();
				System.out.println("enter update Book Name");
				sc.nextLine();
				 nm=sc.nextLine();
				System.out.println("enter update Book Author");
				 au=sc.nextLine();
				System.out.println("enter update Book Price");
				 p=sc.nextDouble();
				
				 obj=new Book(i, nm, au, p);
				 r=dao.updateBook(obj);
				 if(r>0)
					 System.out.println("Record Update!!!");
				 else 
					 System.out.println("Record not Found");
				
				 break;
				 
			case 3:
					System.out.println("enter Book Id tobe Deleted");
					i=sc.nextInt();
					r=dao.deleteBook(i);
					
					if(r>0)
						System.out.println("Record Book");
					else
						System.out.println("Record not Found");
					break;
			case 4:
					dao.showBooks();
					break;
					
			default:
					System.out.println("Invalid Choice....!!!!");
			}
			System.out.println("Do You Want To Continue? (y/n)");
			ans=sc.next();
					
		}while(ans.equals("y") || ans.equals("Y"));
		
	}

}
