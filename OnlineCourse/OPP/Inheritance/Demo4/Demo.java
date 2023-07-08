package com.Radom.java.OnlineCourse.OPP.Inheritance.Demo4;

public class Demo {

	public static void main(String[] args) {
		Super s = new Super(10);
		Super s1;
		Call c = new Call(7, 8);
		s1 = s;
		System.out.println("s1.a " + s1.a);
		s1 = c;
		System.out.println("s1.a " + s1.a);
		// x1.a=10;

	}

}
