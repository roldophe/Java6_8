package com.Radom.java.OnlineCourse.OPP.Abstraction;

/*
 * Java Abstract Class:
 * -The abstract class in Java cannot be instantiated
 * (We cannot create object of abstract classes);
 * -We  use the abstract keyword to declare an abstract class;
 * -An abstract class can have both the regular methods and abstract methods;
 */

/*
 * Java Abstract Method :
 * -A method that doesn't have its body is known as an abstract method;
 * -We use the same abstract keyword to create abstract methods
 */

/*
 * Implementing Abstract Methods:
 * If the abstract class includes any abstract method,
 * 				then all the child classes inherited from the abstract superclass must provide
 * 				the implementation of the abstract method;
 */
public class AbstractDemo {
	public static void main(String[] args) {
		
		KhmerLanguage khmerLanguage = new KhmerLanguage();
		khmerLanguage.display();
		khmerLanguage.sayHello();
		ThaiLanguage thiaLanguage = new ThaiLanguage();
		thiaLanguage.display();
		thiaLanguage.sayHello();
		
	}
}
