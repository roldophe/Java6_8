package com.Radom.java.OnlineCourse.school.Recursion;

public class PGCD {

	public static int pgcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return pgcd(b, a % b);
	}

	public static void main(String[] args) {
		int a = 36, b = 30;
		System.out.print(pgcd(a, b));

	}

}