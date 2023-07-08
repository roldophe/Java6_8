package com.Radom.java.OnlineCourse.OPP.AbstractionPractice.Animal;

public abstract class Animal {

	protected String name;
	protected int age;
	
	public void eat() {
		System.out.println("Animal can eat");
	}
	
	public abstract void makeSounds();
}

