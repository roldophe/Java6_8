package com.Radom.java.OnlineCourse.OPP.AbstractionPractice.Shape;

public class DemoAbsrtactShape {

	public static void main(String[] args) {
		Shape shapeObj[] = new Shape[4];
		shapeObj[0] = new Triangles(9.0, 11.0, "Right");
		shapeObj[1] = new Triangles(15.0, "Right");
		shapeObj[2] = new Rectangle(12.5);
		shapeObj[3] = new Rectangle(11);
		for (int i = 0; i < shapeObj.length; i++) {
			System.out.println("Object Shape["+(i+1)+"]: " + shapeObj[i].toString());
			//System.out.println("Object Shape["+(i+1)+"]: " + shapeObj[i].getName());
			//System.out.println("Area is " + shapeObj[i].area());
		}
		
		System.out.println("---------------------------------\n");
		for (int i = 0; i < shapeObj.length; i++) {
			//System.out.println("Object Shape["+(i+1)+"]: " + shapeObj[i].toString());
			System.out.println("Object Shape["+(i+1)+"]: " + shapeObj[i].getName());
			System.out.println("Area is " + shapeObj[i].area());
		}

	}

}
