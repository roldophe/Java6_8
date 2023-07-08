package com.Radom.java.OnlineCourse.Test;

public class InserrtSort {
	/* Insertion-sort of an array of characters into nondecreasing order */
	public static void insertionSort(char[] data) {
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
		for (char c : JavaCharArray) {
			System.out.println(c);
		}
		insertionSort(JavaCharArray);
		for (char c : JavaCharArray) {
			System.out.print(c + "  ");
		}

	}

}
