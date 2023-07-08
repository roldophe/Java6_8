package com.Radom.java.OnlineCourse.OPP.Inheritance.Demo1;

public class Animal /* extends object */ {
	protected String name;

	void showName() {
		System.out.println("Animal name is " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected void eat() {
		System.out.println("Animal can eat.");
	}
}
