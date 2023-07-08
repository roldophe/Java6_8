package com.Radom.java.OnlineCourse.school.FirstDemo;

public class DemoOperator {

	public static void main(String[] args) {
		int a = 12;
		int b = 5;

		float c1 = (float) a / b;
		int c2 = a - b;
		int c3 = a + b;
		int c4 = a % b;
		System.out.println(a + " / " + b + " = " + c1);
		System.out.println(a + " - " + b + " = " + c2);
		System.out.println(a + " + " + b + " = " + c3);
		System.out.println(a + " % " + b + " = " + c4);

		// RELATIONAL OPERATOR
		System.out.println("\nRelational Operator");
		int x = 13;
		int y = 25;
		boolean z = (x >= y);
		System.out.print(x + " >= " + y + ": ");
		System.out.println(z);

		// LOGICAL OPERATOR
		System.out.println("\nLOGICAL OPERATOR");
		int i = 15;
		int j = 10;
		System.out.println("LOGICAL AND (&&) ");
		boolean k1 = (i > j) && (i >= 12);
		System.out.println(i + " > " + j + " && " + i + " >= 12: " + k1);

		System.out.println("\nLOGICAL OR (||)");
		boolean k2 = (i > j) || (i >= 12);
		System.out.println(i + " > " + j + " || " + i + " <= 12: " + k2);

		System.out.println("\nLOGICAL NOT (!)");
		boolean k3 = !(i > j);
		System.out.println("!(" + i + ">" + j + "):" + k3);

		// UNARY OPERATOR
		System.out.println("\nUNARY OPERATOR");
		int q = 13;
		int e = ++a;
		int r = 12;
		int w = r++;
		System.out.println("q : " + q);
		System.out.println("e : " + e);
		System.out.println("r : " + r);
		System.out.println("w : " + w);
	}

}
