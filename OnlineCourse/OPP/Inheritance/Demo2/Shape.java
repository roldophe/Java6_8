package com.Radom.java.OnlineCourse.OPP.Inheritance.Demo2;

public class Shape {
	private double width;
	private double height;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void showWH() {
		System.out.println("Width = " + width + "and Height = " + height);
	}
}
