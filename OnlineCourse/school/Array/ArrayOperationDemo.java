package com.Radom.java.OnlineCourse.school.Array;

import java.util.Arrays;

public class ArrayOperationDemo {

	public static void main(String[] args) {
		test();
		// addArray();
		// addNewElementAtSpecificIndex();
		// updateArray();
		// updateManyElement();
		// removeElement();
		// removeManyElement();
	}

	public static void test() {
		// creating two matrices
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

		// creating another matrix to store the multiplication of two matrices
		int c[][] = new int[3][3]; // 3 rows and 3 columns

		// multiplying and printing multiplication of 2 matrices
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				} // end of k loop
				System.out.print(c[i][j] + " "); // printing matrix element
			} // end of j loop
			System.out.println();// new line
		}
	}

	public static void addArray() {
		int[] a = new int[4];
		a[0] = 23;
		a[1] = 45;
		a[2] = 14;
		a[3] = 25;
		int newElement = 78;
		System.out.println(Arrays.toString(a));

		int[] b = new int[a.length + 1];

		// step copy
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		b[b.length - 1] = newElement;
		a = b;
		System.out.println(Arrays.toString(a));
	}

	public static void addNewElementAtSpecificIndex() {
		int a[] = { 23, 45, 12, 65, 34, 82, 34, 56 };
		System.out.println("Before : " + Arrays.toString(a));
		int b[] = new int[a.length + 1];
		int indexToAdd = 0;
		int newValue = 84;
		// step1;
		int i = 0;
		for (i = 0; i < indexToAdd; i++)
			b[i] = a[i];
		// step2;
		b[indexToAdd] = newValue;
		// step3;
		for (i = indexToAdd + 1; i < b.length; i++)
			b[i] = a[i - 1];
		a = b;
		System.out.println("After  : " + Arrays.toString(a));

	}

	public static void updateArray() {
		int a[] = { 45, 12, 34, 82, 34 };
		System.out.println("Before: " + Arrays.toString(a));
		int indexToUpdate = 2;
		int newValue = 13;
		a[indexToUpdate] = newValue;
		System.out.println("After : " + Arrays.toString(a));
	}

	public static void updateManyElement() {
		int a[] = { 18, 12, 32, 34, 56, 95 };
		System.out.println("Before: " + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 50)
				a[i] = a[i] + 20;
		}
		System.out.println("After : " + Arrays.toString(a));
	}

	public static void removeElement() {
		int a[] = { 18, 12, 32, 34, 56, 95 };
		System.out.println("Before: " + Arrays.toString(a));

		int b[] = new int[a.length - 1];
		int indexToDelete = 2;

		// step1;
		for (int i = 0; i < indexToDelete; i++)
			b[i] = a[i];
		// step2;
		for (int i = indexToDelete; i < b.length; i++)
			b[i] = a[i + 1];
		// step3;
		a = b;
		System.out.println("After : " + Arrays.toString(a));

	}

	public static void removeManyElement() {
		int a[] = { 18, 12, 30, 34, 56, 30 };
		int valueToDelete = 30;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == valueToDelete)
				count++;
		}

		int[] b = new int[a.length - count];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != valueToDelete) {
				b[index] = a[i];
				index++;
			}
		}
		System.out.println("After : " + Arrays.toString(a));
		a = b;
		System.out.println("After : " + Arrays.toString(a));

	}

}
