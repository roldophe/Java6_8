package com.Radom.java.OnlineCourse.OPP.MethodOverLoading;

import java.util.Arrays;

public class MethodOverLoadingDemo {

	public static void main(String[] args) {
		/*
		 * print("Welcom to Cambodia"); print(168); print(128.00);
		 * 
		 * print("Amount", 100);
		 * 
		 * int[] a = { 16, 32, 28, 94 }; print(a);
		 */
		printNumbers(10, 34, 34, 76, 43, 85, 34);
		Display("Sting", 1, 2.5, 3.25);
	}

	public static void Display(String name, double... price) {
		System.out.println(name);
		for (double p : price) {
			System.out.println(p);
		}
	}

	public static void printNumbers(int... numbers) {
		System.out.println(Arrays.toString(numbers));
	}

	public static void print(int[] numbers) {
		for (int n : numbers) {
			System.out.println(n + " ");
		}
	}

	public static void print(String proterty, int value) {
		System.out.println(proterty + " = " + value);
	}

	public static void print(String text) {
		System.out.println(text);
	}

	public static void print(Double text) {
		System.out.println(text);
	}

	public static void print(Integer text) {
		System.out.println(text);
	}
}
