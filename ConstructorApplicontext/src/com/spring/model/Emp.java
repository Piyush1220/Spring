package com.spring.model;

public class Emp {

		private int id;
		private String name;
		private double salary;
		public Emp(int id, String name, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "\n [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
		
		
}
