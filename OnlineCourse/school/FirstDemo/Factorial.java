package com.Radom.java.OnlineCourse.school.FirstDemo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Input n value: ");
			int n = sc.nextInt();

			if (n >= 0) {
				System.out.println(n + " Factorial: " + getFact(n));
			} else {
				System.out.println(n + " Factorial: No factorial.");
			}
		}

	}

	private static int getFact(int num) {
		if (num == 1 || num == 0) {
			return 1;
		}

		return num * getFact(num - 1);
	}

}
