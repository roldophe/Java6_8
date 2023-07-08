package com.Radom.java.OnlineCourse.school.FirstDemo;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		int i ;
		//int s=0, m=1;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number: ");
			int n = sc.nextInt();
			/*
			for (i = 1; i <= (4 * n - 3); i = i + 4) {
				s += i;
			}

			for (i = 2; i <= (5 * n - 3); i = i + 5) {
				m *= i;
			}
			*/
			int total=0;
			//1+6+11+...+n
			//5n-4
			for(i=1; i<=n; i++)
			{
				System.out.print("\t"+(5*i-4));
				total+=(5*i-4);
			}
			System.out.print("\nTotal: "+total);
//		System.out.println("Sum=" + s);
//		System.out.println("Mul=" + m);
		}
	}

}
