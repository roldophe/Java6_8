package com.Radom.java.OnlineCourse.OPP.Abstraction;

public abstract class Language {

	protected int year;

	public Language() {
		this(1250);
	}
	// call constructor

	public Language(int year) {
		this.year = year;
	}

	abstract void display();

	abstract void sayHello();

	void info() {
		System.out.println("This is a language class.");
		System.out.println("This language was inetented in " + year);
	}

}
