package com.spring.model;

public class Emp {

	private int eid;
	private String ename;
	private Dept d;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Dept getD() {
		return d;
	}
	public void setD(Dept d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", d=" + d +"]";
	}
//	public Dept getD1() {
//		return d1;
//	}
//	public void setD1(Dept d1) {
//		this.d1 = d1;
//	}
	
	
}
