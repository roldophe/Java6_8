package com.Radom.java.OnlineCourse.school.Function;

import java.util.Arrays;
import java.util.Scanner;

public class DemoFunction {

	public static void main(String[] args) {
		int a[] = { 38, 75, 26, 43, 34 };
		int b[] = { 58, 15, 46, 53, 24 };
		//int[] c = {};
		// printArray(a);
		// printArray(b);
		getSumArray(a,b);
		//max(a);
		//mini(b);
		//max(c);
		//getArray(3);
		//getSumArray(a,b);
		// power(2,3);
	}
public static void getSumArray(int[] x, int[] y){
	int total=0;
	total=sumArray(x)+sumArray(x);
	System.out.println(total);
}
public static void getArray(int n) {
	try (Scanner input = new Scanner(System.in)) {
		int arr[]= new int[n];
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter number"+(i+1)+":");
			arr[i]= input.nextInt();
		}
		/*
		for(int i=0; i<n; i++)
		{
			System.out.println("number"+(i+1)+":"+arr[i]);
		}*/
		printArray(arr);
	}
}
	public static void max(int[] a) {

		if (a.length != 0) {
			int max = a[0];
			for (int i = 1; i < a.length; i++) {
				if (a[i] > max)
					max = a[i];
			}
			System.out.println(max);
		} else
			System.out.println("This array is empty.");

	}

	public static void mini(int[] a) {
		if (a.length != 0) {
			int min = a[0];
			for (int i = 1; i < a.length; i++) {
				if (a[i] < min)
					min = a[i];
			}
			System.out.println(min);
		} else
			System.out.println("This array is empty.");
	}

	public static void power(int n, int m) {
		int res = 1;
		for (int i = 1; i <= m; i++) {
			res *= n;
		}
		System.out.println(res);
	}

	public static void printArray(int[] x) {

		for(int i=0; i<x.length; i++)
		{
			System.out.println("number"+(i+1)+":"+x[i]);
		}
		System.out.println(Arrays.toString(x));
	}

	public static int sumArray(int[] a) {
		int total = 0;
		for (int i : a) {
			total += i;
		}
		return total;
	}

}
