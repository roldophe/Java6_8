package com.Radom.java.OnlineCourse.Basic.Loop;

public class ForLoop {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++)
			System.out.println("Welcome to cambodia");

		/*
		 * for(initialExpression; testExpression; upExpression) {
		 * 
		 * statement; 
		 * 
		 * }
		 */
		int sum=0;
		int mul=1; //somrab phol kun trov oy i ng mul =1;
		
		for (int i = 1; i <=5; i++) 
		{
			System.out.print("\t"+i);
			sum+=i;
			mul =mul*i;	
		}
		System.out.print("\tSum="+sum);
		System.out.print("\tMul="+mul);
		
			

		
	}

}
