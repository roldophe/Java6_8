package com.Radom.java.OnlineCourse.Basic.Loop;

import java.util.Scanner;

public class DemoWhileLoop {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = 2;
			String input = "";
			while (true) {
				System.out.println(num);
				System.out.println("Count Continue?(y or n)");
				input = sc.next();
				if (input.equalsIgnoreCase("N"))
					break;
				num++;
			}
		}
		System.out.println("closed!");
	}

}
