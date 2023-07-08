package com.Radom.java.OnlineCourse.Interface.Practice2.Pologon;

public class Triangle implements Area, Perimeter /* or Polygon */ {

	protected double a;
	protected double b;
	protected double c;

	public Triangle() {

	}

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double getArea() {
		double p = a + b + c / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	@Override
	public double calculatePerimeter() {
		return a + b + c;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ", Area=" + getArea() + "]";
	}

}
