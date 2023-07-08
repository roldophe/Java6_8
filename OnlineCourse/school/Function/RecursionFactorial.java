package com.Radom.java.OnlineCourse.school.Function;

import java.util.Scanner;

public class RecursionFactorial {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter number of facatotial: ");
			int n=input.nextInt();
			int f=factorial(n);
			System.out.println(n+" Factorial: "+f);
		}

	}
	public static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
	}

}
