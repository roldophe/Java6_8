package com.Radom.java.OnlineCourse.school.Loop;

import java.util.Scanner;

public class BreakStatement {

	public static void main(String[] args) {
		Double number, sum = 0.0;
		try (// Create an object of Scanner;
		Scanner input = new Scanner(System.in)) {
			while (true) {
				System.out.print("Enter a number : ");
				number = input.nextDouble();
				if (number < 0.0)
					break;
				sum += number;
			}
		}

		System.out.print("Sum = " + sum);
	}

}
