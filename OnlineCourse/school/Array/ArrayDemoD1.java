package com.Radom.java.OnlineCourse.school.Array;

import java.util.Scanner;

public class ArrayDemoD1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Array one dimentional using to find day in month:");
		int[] day_in_month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < 12; i++) {
			System.out.println("\tMonth" + (i + 1) + " has " + day_in_month[i] + "days");
		}

		System.out.println("About cars");
		String cars[] = { "BMW", "Ford", "Mazda", "Volvo", "GTR" };

		for (int i = 0; i < cars.length; i++) {
			System.out.println("\t Car" + (i + 1) + ": " + cars[i]);
		}
		
		/*
		 * for (type variable : arrayname) 
		 * { 
		 * 		... 
		 * }
		 */
		
		System.out.println("\n\tUsing i:cars" + ":");
		for (String i : cars)
			System.out.println("\t" + i);
		input.close();
	}
}
