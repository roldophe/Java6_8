package com.Radom.java.OnlineCourse.school.Array;

import java.util.Arrays;

public class arrayCopy {

	public static void main(String[] args) {
		int[] n1 = { 23, 56, 27, 23, 67, 2 };
		int[] n3 = new int[5];
		int[] n2 = new int[n1.length];
		System.arraycopy(n1, 0, n2, 0, n1.length);
		System.arraycopy(n1, 2, n3, 1, 3);

		System.out.println(Arrays.toString(n2));
		System.out.println(Arrays.toString(n3));
	}

}
