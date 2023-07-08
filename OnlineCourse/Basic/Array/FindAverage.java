package com.Radom.java.OnlineCourse.Basic.Array;

public class FindAverage {

	public static void main(String[] args) {

		int[] a = { 12, 38, 45, 55, 31 };
		double total = 0;
		int numberOfElement = a.length;
		for (int i : a) {
			total += i;
		}
		double avg = (total / numberOfElement);
		System.out.println("Average: " + avg);
	}

}
