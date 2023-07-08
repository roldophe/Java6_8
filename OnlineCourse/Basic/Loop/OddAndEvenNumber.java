package com.Radom.java.OnlineCourse.Basic.Loop;

public class OddAndEvenNumber {
public static void main(String[] args) {
	System.out.print("Even number: ");
	int n=10;
	for(int i=1; i<=n; i++)
	{
		if(i%2==0)
			System.out.print("\t"+i);
	}
	System.out.print("\nOdd number: ");
	for(int i=1; i<=n; i++)
	{
		if(i%2!=0)
			System.out.print("\t"+i);
	}
}
}
