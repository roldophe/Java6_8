package com.Radom.java.OnlineCourse.OPP.Abstraction;

public class KhmerLanguage extends Language {

	public KhmerLanguage() {
		super(900);
	}
	
	//abstract String hello();
	
	void display() {
		System.out.println("\nThis a KhmerLanguage class.");
	}

	@Override
	void sayHello() {
		System.out.println("Khmer say hello: suo sdey");
		
	}
	
}
