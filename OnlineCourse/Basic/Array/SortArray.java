package com.Radom.java.OnlineCourse.Basic.Array;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] a = {10,43,34,12,41,23};
		System.out.println("Before: "+Arrays.toString(a));
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After : "+Arrays.toString(a));
	}

}
