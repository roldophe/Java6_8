package com.Radom.java.OnlineCourse.OPP.AbstractionPractice.Shape;

public abstract class Shape {
	private double width;
	private double height;
	private String name;

	Shape() {
		width = height = 0;
		name = "null";
	}

	Shape(double w, double h, String n) {
		this.height = h;
		this.width = w;
		this.name = n;
	}

	Shape(double x, String n) {
		width = height = x;
		name = n;
	}

	Shape(Shape obj) {
		width = obj.width;
		height = obj.height;
		name = obj.name;
	}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[width = " + width + ", height = " + height + ", name = " + name + ", area = " + area() + "]";
	}

	abstract double area();

}
