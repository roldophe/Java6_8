package com.Radom.java.OnlineCourse.OPP.Inheritance.Demo3;

public class Shape {
	private double width;
	private double height;

	public Shape(double addrWidth, double addrHeight) {
		this.width = addrWidth;
		this.height = addrHeight;
	}

	public void setWidth(double addrWidth) {
		this.width = addrWidth;
	}

	public void setHeight(double addrHeight) {
		this.height = addrHeight;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public String showWH() {
		return ("Width = " + width + " and Heigth = " + height);
	}
}
