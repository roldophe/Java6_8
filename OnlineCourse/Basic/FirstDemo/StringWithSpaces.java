package com.Radom.java.OnlineCourse.Basic.FirstDemo;

import java.util.Scanner;

public class StringWithSpaces {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String name = scanner.nextLine();
		//name += scanner.nextLine();
		scanner.close();
		System.out.println(name);

	}

}
