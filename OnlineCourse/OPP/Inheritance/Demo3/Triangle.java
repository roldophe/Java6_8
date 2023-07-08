package com.Radom.java.OnlineCourse.OPP.Inheritance.Demo3;

public class Triangle extends Shape {
	private String style;

	public Triangle(double addrWidth, double addrHeight, String addrStyle) {
		// Call super class constructor
		super(addrWidth, addrHeight);
		this.style = addrStyle;
	}

	double area() {
		return (getHeight() * getWidth()) / 2;
	}

	@Override
	public String toString() {
		return "Triangle [style=" + style + ", area()=" + area() + "]";
	}

}
