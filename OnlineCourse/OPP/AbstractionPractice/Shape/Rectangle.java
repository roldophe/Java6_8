package com.Radom.java.OnlineCourse.OPP.AbstractionPractice.Shape;

public class Rectangle extends Shape {

	public Rectangle() {
		super();
	}

	Rectangle(double w, double h) {
		super(w, h, "Rectangle");
	}

	Rectangle(double x) {
		super(x, "Rectangle");
	}

	Rectangle(Rectangle obj) {
		super(obj);
	}

	boolean isSquare() {
		if (getHeight() == getWidth())
			return true;
		else
			return false;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return getWidth() * getHeight();
	}


}
