package com.Radom.java.OnlineCourse.school.Recursion;

import java.util.Scanner;

public class SumOfNumber {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i, s = 0, m = 1;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number: ");
			int n = sc.nextInt();
			/*
			 * for (i = 1; i <= (4 * n - 3); i = i + 4) { s += i; }
			 * 
			 * for (i = 2; i <= (5 * n - 3); i = i + 5) { m *= i; }
			 */
			 Getsum(n);
			//sum=2+5+8+...+3n
			System.out.println(getSumOfNumber1(n));
			//sum=5+8+11+14...+3n
			System.out.println(getSumOfNumber2(n));
			//sum=1+5+9+...+4n
			System.out.println(getSumOfNumber3(n));
		}
	}

	public static int getSumOfNumber1(int n)

	{
		if (n==1)
			return 2
					;//initial: n=1 value=2
		else //(3*n-1): is condition and (n-1) is a loop
			return (3*n-1 + getSumOfNumber1(n - 1));
	}
	public static int getSumOfNumber2(int n)

	{
		if (n==1)
			return 5; //initial: n=1 value=5
		else //(3*n+2): is condition and (n-1) is a loop
			return (3*n+2 + getSumOfNumber2(n - 1));
	}
	public static int getSumOfNumber3(int n)

	{
		if (n==1)
			return 1;//initial: n=1 value=1
		else //(4*n-3): is condition and (n-1) is a loop
			return (4*n-3 + getSumOfNumber3(n - 1));
	}
	
	  public static void Getsum(int n) { 
	  		int total1=0, total2=1; 
	  		for(int i=1; i<=n; i++) { 
				System.out.print("\t" + (2 * i - 1));
	   			total1 += (2 * i - 1);
	  			total2 *= (2 * i - 1); 
	  } 
	  	System.out.print("\nTotal: " + total1);
	  	System.out.println("\nTotal: " + total2); 
	  }

}
