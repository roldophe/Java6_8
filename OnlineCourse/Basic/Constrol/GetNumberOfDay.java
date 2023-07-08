package com.Radom.java.OnlineCourse.Basic.Constrol;

import java.util.Scanner;

public class GetNumberOfDay {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Input Month: ");
			int month = sc.nextInt();
			int numberOfDay = 0;//Help you no need to use default:
			switch (month) {
				// 31:1, 3, 5, 7, 8, 12
				// 30: 4, 6, 9, 11
				// 28 or 29: 2
				case 1: case 3: case 5: case 7: case 8: case 12:
					numberOfDay = 31;
					break;
				case 4: case 6: case 9: case 11:
					numberOfDay = 30;
					break;
				case 2: {
					System.out.print("Input Year: ");
					int year = sc.nextInt();
					if (year % 4 == 0)
						numberOfDay = 29;
					else
						numberOfDay = 28;
				}
			}
			if (numberOfDay != 0)
				System.out.print("Number of day: " + numberOfDay);
			else
				System.out.print("Invalid month...!");
		}
	}
}
