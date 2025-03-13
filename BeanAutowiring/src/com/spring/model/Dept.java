package com.spring.model;

public class Dept {

	private int did;
	private String dname;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + "]";
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
	
	
}
