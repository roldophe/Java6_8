package com.Radom.java.OnlineCourse.school.Array;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArrayFromKeyboard {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n value: ");
		int n = input.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter number" + (i + 1) + ": ");
			a[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(a));
		input.close();
	}
	

}
