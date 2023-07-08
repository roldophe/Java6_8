package com.Radom.java.OnlineCourse.school.Recursion;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter number: ");
			int number = input.nextInt();
			//reverse(number);
			System.out.println(reverse(number));
		}
	}
	/*
	public static void reverse(int n) {
		if (n < 10) {
			System.out.println(n);
			return;
		} else {
		System.out.print(n%10+" ");
		reverse(n/10);
		}
	}*/
	public static int reverse (int n) {
		int sum=0;
		if(n==0)
			return 0;
		else {
			sum=sum*10+n%10;
			return reverse(n);
		}
	}

}
