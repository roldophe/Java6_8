package com.Radom.java.OnlineCourse.Basic.Constrol;

import java.util.Scanner;

public class DemoIf {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter n value:");
			 int n = sc.nextInt();
			//int n = -23;
			if (n < 0)
				System.out.println(n + " is negtive number");
			// else
			if (n > 0)
				System.out.println(n + " is positive number");

			n = 13;
			if (n % 2 == 0)
				System.out.println(n + " Even Number");
			else
				System.out.println(n + " Odd Number");
		}
	}

}
