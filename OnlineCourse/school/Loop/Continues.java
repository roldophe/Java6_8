package com.Radom.java.OnlineCourse.school.Loop;

import java.util.Scanner;

public class Continues {

	public static void main(String[] args) {
		
		//skip condition(i>5)
		/*
			for(int i=1; i<=10; i++)
			{
				if(i>5) 
				{
					continue; 
				}
				System.out.print("\nNumber"+i);
			}
		*/
		
		try (//Sum only even number
		Scanner input = new Scanner(System.in)) {
			System.out.print("Enter n value: ");
			int n=input.nextInt();
			int even=0,odd=0;
			for(int i=1; i<=n; i++)
			{
				if(i%2!=0)
				{
					
					System.out.print("\tOdd: "+i);
					odd+=i;
				}
				else
				{
					System.out.print("\nEven: "+i);
					even+=i;
				}
			}
			System.out.print("\nsumOdd : " + odd);
			System.out.print("\nsumEven: "+even);
		}
		
	}

}
