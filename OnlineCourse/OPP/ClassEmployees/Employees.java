package com.Radom.java.OnlineCourse.OPP.ClassEmployees;

public class Employees {
	private String name;
	private String gender;
	private int age;
	
	//Constructor with Parameters
	public Employees(String n, String s, int a) {
		this.name = n;
		this.gender = s;
		this.age = a;
	}
	//Display Details...
	public void displayDetails() {
		System.out.println("Name: %s  Gender: %s  Age: %d".formatted(name, gender, age));
	}

}
