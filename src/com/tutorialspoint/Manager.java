package com.tutorialspoint;

public class Manager extends Employee {

	private String name;
	private int id;
	public void getName() {
		System.out.println("The name of the Manager is :"+name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getId() {
		System.out.println("The Id of the Manager is :"+id);
	}
	public void setId(int id) {
		this.id = id;
	}
}
