package com.Radom.java.OnlineCourse.Basic.Array;

public class CheckNumber {

	public static void main(String[] args) {
		int[] a = { 12, 38, 45, 55, 31 };
		int numberToFind = 12;
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (numberToFind == a[i]) {
				index = i;
			}
		}
		if (index != -1)
			System.out.println("Number exist");
		else
			System.out.println("Number does not exist");

	}

}
