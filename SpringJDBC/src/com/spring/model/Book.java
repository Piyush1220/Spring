package com.spring.model;

public class Book {
	private int bid;
	private String bname,author;
	private double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bid, String bname, String author, double price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "\n [bid=" + bid + ", bname=" + bname + ", author=" + author + ", price=" + price + "]";
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
