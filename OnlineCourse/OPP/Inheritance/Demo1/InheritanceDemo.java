package com.Radom.java.OnlineCourse.OPP.Inheritance.Demo1;

public class InheritanceDemo {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setName("KOKO");
		animal.showName();

		Dog dog = new Dog();
		dog.eat();
		dog.eatAll();
	}

}
