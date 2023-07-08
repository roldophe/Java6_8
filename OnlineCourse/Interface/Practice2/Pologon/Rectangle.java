package com.Radom.java.OnlineCourse.Interface.Practice2.Pologon;

public class Rectangle implements Polygon{

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
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

	@Override
	public double getArea() {
		return getWidth()*getHeight();
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", Area=" + getArea() + "]";
	}

	@Override
	public double calculatePerimeter() {
		
		return (width+height)*2;
	}

	@Override
	public void draw() {
		System.out.println("Draw rectagle");
	}

}
