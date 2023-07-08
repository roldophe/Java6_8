package com.Radom.java.OnlineCourse.OPP.Inheritance.Demo2;

public class Triangle extends Shape {
		String style;

		double area() {
			return (getWidth() * getHeight()) / 2;
		}

		void showStyle() {
			System.out.println("The Style of Triangle is " + style);
		}
	}

