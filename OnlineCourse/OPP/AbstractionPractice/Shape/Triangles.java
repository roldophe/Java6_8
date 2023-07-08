package com.Radom.java.OnlineCourse.OPP.AbstractionPractice.Shape;

public class Triangles extends Shape {

	private String style;

	public Triangles() {
		super();
		style = "null";
	}

	public Triangles(double w, double h, String s) {
		super(w, h, "Triangle");
		style = s;
	}

	public Triangles(double x, String n) {
		super(x, "Triangle");
		style = n;
	}

	public Triangles(Triangles obj) {
		super(obj);
		style = obj.style;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return getHeight() / 2 * getWidth();
	}


}
