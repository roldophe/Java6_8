package com.Radom.java.OnlineCourse.OPP.Inheritance.Demo1;

public class Dog extends Animal {

	void showeInfor() {
		System.out.println("This is a dog");
	}
	protected void eatAll()
	{
		super.eat();
		System.out.println("eat call from superclass");
	}
	@Override
	final void showName() {
		this.eat();
		System.out.println("This dog is name: "+name);
	}
	
}
