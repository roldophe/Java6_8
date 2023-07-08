package com.Radom.java.OnlineCourse.Basic.Loop;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		/*
		 * n=5 number1=31 number2=13 number3=14 number4=34 number5=23
		 */
		int number = 0, n = 0;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter n number: ");
			n = scanner.nextInt();
			int max = 0;
			for (int i = 1; i <= n; i++) {
				System.out.print("Number" + i + ": ");
				number = scanner.nextInt();
				if (max < number)
					max = number;
			}
			System.out.print("Maximum: " + max);
		}

	}

}
