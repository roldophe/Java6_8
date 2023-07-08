package com.Radom.java.OnlineCourse.school.FirstDemo;

import java.util.Scanner;

public class SumTwoNumber {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Input Number1: ");
			int num1 = scanner.nextInt();
			System.out.print("Input Number2: ");
			int num2 = scanner.nextInt();

			int total = num1 + num2;
			System.out.println("Sum = " + total);
		}
	}

}
