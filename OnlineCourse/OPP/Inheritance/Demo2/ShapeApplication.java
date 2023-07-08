package com.Radom.java.OnlineCourse.OPP.Inheritance.Demo2;

public class ShapeApplication {

	public static void main(String[] arg) {
		Triangle obj = new Triangle();
		obj.setWidth(4.0);
		obj.setHeight(5.0);
		obj.style = "isosceles";
		System.out.println("All Information of Object");
		obj.showStyle();
		obj.showWH();
		System.out.println("The area = " + obj.area());

	}
}
