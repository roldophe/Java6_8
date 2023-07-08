package com.Radom.java.OnlineCourse.school.FirstDemo;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Input Number: ");
			int num = sc.nextInt();

			int reminder = num % 2;
			if (reminder == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		}
	}

}
