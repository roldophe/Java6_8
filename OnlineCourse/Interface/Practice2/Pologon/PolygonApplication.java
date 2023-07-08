package com.Radom.java.OnlineCourse.Interface.Practice2.Pologon;

public class PolygonApplication {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(4, 5);
		System.out.println(rectangle.toString());
		// System.out.println(rectangle.getArea());
		rectangle.draw();
		rectangle.info();
		Polygon.test();
		System.out.println("P " + rectangle.calculatePerimeter());

		Triangle triangle = new Triangle(3, 4, 5);
		// System.out.println(triangle.getArea());
		System.out.println(triangle.toString());
		System.out.println("P: " + triangle.calculatePerimeter());
		
		Shape shape = new Shape();
		shape.t();
	}

}
