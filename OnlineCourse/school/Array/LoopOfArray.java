package com.Radom.java.OnlineCourse.school.Array;

public class LoopOfArray {

	public static void main(String[] args) {
		/*
		int a[]= {34, 56, 87,12, 90};
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
		*/
		
		//Using for-each loop
		
		String[] name= {"RADOM"," KHOEM"," Male"};name.clone();
		//for(String i:name)
			//System.out.print(i);
		
		int[] n= {90,10,50,20,30};
		int sum=0;
		//using for each
		/*
		for(int i: n)
			sum+=i;
		System.out.println(sum);
		*/
		
		//using for index loop
		for(int i=0; i<n.length; i++)
		{
			sum+=n[i];
		}
		System.out.println(sum);
	}

}
