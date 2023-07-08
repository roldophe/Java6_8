package com.Radom.java.OnlineCourse.school.FirstDemo;

public class DemoConversion {

	public static void main(String[] args) {
		byte b;
		int i = 234;
		double d = 123.456;
		b = (byte) i;
		System.out.println("Conversion of integer to byte.");
		System.out.println(i + " to " + b);
		b = (byte) d;
		System.out.println("Conversion of Double to byte.");
		System.out.println(d + " to " + b);
		d = (int) i;
		System.out.println("Conversion of Double to intger.");
		System.out.println(d + " to " + i);
	}

}
