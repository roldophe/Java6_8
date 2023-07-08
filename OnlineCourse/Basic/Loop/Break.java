package com.Radom.java.OnlineCourse.Basic.Loop;

public class Break {

	public static void main(String[] args) {
		//break is used to exit loop
		//1 to 10
		int total=0;
		for(int i=1; i<=100; i++)
		{
			System.out.print(i+"+");
			total+=i;
			if(i==5)
				break;
		}
		System.out.print("\b = "+total);
	}

}
