package com.Radom.java.OnlineCourse.Basic.Array;

public class SortingArray {
	/* Insertion-sort of an array of characters into nondecreasing order */
	private static void insertionSort(char[] data) {
		int n = data.length;

		for (int k = 0; k < n; k++) {
			char cur = data[k];
			int j = k;
			while (j > 0 && data[j - 1] > cur) {
				data[j] = data[j - 1];
				j--;
			}
			data[j] = cur;
		}
	}

	public static void main(String[] args) {
		char[] JavaCharArray = new char[5];
		JavaCharArray[0] = 'e';
		JavaCharArray[1] = 'b';
		JavaCharArray[2] = 'c';
		JavaCharArray[3] = 'd';
		JavaCharArray[4] = 'a';
		
		System.out.println("Before Sorting");
		for (char k : JavaCharArray) {
			System.out.print(k+"  ");
		}
		insertionSort(JavaCharArray);
		System.out.println("\nAfter Sorting");
		for (char k : JavaCharArray) {
			System.out.print(k + "  ");
		}

	}
}
