package com.Radom.java.OnlineCourse.OPP.ConstructorBook;

import java.util.Scanner;

public class Utils {
	public static String getString(String label) {
		System.out.print(label);
		Scanner scanner = new Scanner(System.in);

		// return scanner.next();
		String text = scanner.next();
		return text;
	}

	public static double getDouble(String label) {
		System.out.print(label);
		Scanner scanner = new Scanner(System.in);

		// return Double.parseDouble(scanner.next());
		Double amount = Double.parseDouble(scanner.next());
		return amount;
	}

}
