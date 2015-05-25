package com.tutorialspoint;

public class Employee {
	private String name;
	private int id;
	public void getName() {
		System.out.println("The name of the Employee is :"+name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getId() {
		System.out.println("The Id of the Employee is :"+id);
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
