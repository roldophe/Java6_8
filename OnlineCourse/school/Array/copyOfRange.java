package com.Radom.java.OnlineCourse.school.Array;

import java.util.Arrays;

public class copyOfRange {

	public static void main(String[] args) {

		int[] source = { 23, 56, 27, 23, 67, 2 };
		int[] destination1 = Arrays.copyOfRange(source, 0, source.length);
		System.out.println("Destination1: "+Arrays.toString(destination1));
		
		int[] destination2 = Arrays.copyOfRange(source, 2, 5); // copying from index 2 to 5 (5 is not included) 
		System.out.println("Destination2: "+Arrays.toString(destination2));

	}

}
