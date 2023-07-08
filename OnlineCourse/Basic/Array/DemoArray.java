package com.Radom.java.OnlineCourse.Basic.Array;

import java.util.Arrays;

public class DemoArray {

	public static void main(String[] args) {
		/*
		 * data type[] array name;
		 */
		System.out.print("\n======================1\n");
		
		String[] name = new String[5];
		name[0]="RADOM";
		System.out.println(Arrays.toString(name));
		
		
		System.out.print("\n======================2\n");
		// Output: [0, 0, 0, 0, 0]
		int[] score = new int[5];
		 System.out.println(Arrays.toString(score));

		 System.out.print("\n======================3\n");
		// Output: [1, 2, 3, 4, 5]
		int[] a = { 1, 2, 3, 4, 5 };
		 System.out.println(Arrays.toString(a));

		 System.out.print("\n======================4\n");
		// output: [RADOM, KHOEM, null, null, null]
		String[] b = new String[5];
		b[0] = "RADOM";
		b[1] = "KHOEM";
		 System.out.println(Arrays.toString(b));

		System.out.print("\n======================5\n");
		// output: [0.0, 23.5, 0.0, 0.0, 45.8]
		double[] d = new double[5];
		d[1] = 23.5;
		d[4] = 45.8;
		System.out.println(Arrays.toString(d));
		System.out.println("d1 = " + d[4]);
		System.out.print("\n======================6\n");

	}

}
