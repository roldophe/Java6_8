package com.Radom.java.OnlineCourse.Basic.Array;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArrayFromKeyboard {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter size of array: ");
			int size= input.nextInt();
			int[] a = new int[size];
			for(int i=0; i<a.length; i++)
			{
				System.out.print("Enter number"+(i+1)+": ");
				a[i]=input.nextInt();
			}
			System.out.println(Arrays.toString(a));
		}
	}

}
