package com.Radom.java.OnlineCourse.Test;

import java.util.Scanner;

public class TestService {

	public Test[] createTests(int n) {
		Test[] tests = new Test[n];
		for (int i = 0; i < n; i++) {
			tests[i] = createTest();
		}
		return tests;
	}

	public void getinfo(Test[] test) {
		for (Test tests : test) {
			System.out.println(tests.DisplayInfo());
		}
	}

	public Test createTest() {
		String title = getString("Please input title   :");
		String author = getString("Please input author :");
		double price = getDouble("Please input price   :");
		Test books = new Test(title, author, price);
		return books;
	}

	public String getString(String label) {
		System.out.print(label);
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}

	public double getDouble(String label) {
		System.out.print(label);
		Scanner scanner = new Scanner(System.in);
		return Double.parseDouble(scanner.next());
	}
}
