package com.Radom.java.OnlineCourse.school.FirstDemo;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int n, sum = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the Number: ");
			n = sc.nextInt();
		}
		//int i = 1;
		// while (i <= n / 2) {
		// if (n % i == 0) {
		// sum += i;
		// }i++;
		// }
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum += i;
		}
		if (sum == n) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not Perfect Number");
		}

	}
}