package com.Radom.java.OnlineCourse.school.Array;

public class Multidimensional {

	public static void main(String[] args) {
		// array2D();
		MultiplicationOfTwoMatrices();
	}

	static void MultiplicationOfTwoMatrices() {
		int[][] a = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };// { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] b = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } }; // { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] c = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			} // end loop J
			System.out.println();
		}
	}

	static void array2D() {
		int a[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 75, 85, 95 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++)
				System.out.print("" + "a" + "[" + i + "]" + "[" + j + "] ");
			System.out.print("\n\n");
		}
	}
}
