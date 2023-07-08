package com.Radom.java.OnlineCourse.school.Array;

import java.util.Arrays;

public class DemoArray {

	public static void main(String[] args) {
		/*
		 * datatype[] arrayname;
		 */
		String[] name = new String[5];
		name.clone();

		// Ouput: [0, 0, 0, 0, 0]
		int[] score = new int[5];
		score.clone();
		// System.out.println(Arrays.toString(score));

		// Output: [1, 2, 3, 4, 5]
		int[] a = { 1, 2, 3, 4, 5 };
		a.clone();
		// System.out.println(Arrays.toString(a));

		// output: [RADOM, KHOEM, null, null, null]
		String[] b = new String[5];
		b[0] = "RADOM";
		b[1] = "KHOEM";
		// System.out.println(Arrays.toString(b));

		// output: [0.0, 23.5, 0.0, 0.0, 45.8]
		double[] d = new double[5];
		d[1] = 23.5;
		d[4] = 45.8;
		System.out.println(Arrays.toString(d));
		System.out.println("d1=" + d[4]);

	}

}
