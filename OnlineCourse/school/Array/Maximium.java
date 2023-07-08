package com.Radom.java.OnlineCourse.school.Array;

public class Maximium {

	public static void main(String[] args) {
		int[] a = { 12, 38, 45, 55, 31 };
		int max=a[0];
		for(int i=1; i<a.length; i++) {
			if(max<a[i])
				max=a[i];
		}
		System.out.println(max);

	}

}
