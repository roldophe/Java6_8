package com.Radom.java.OnlineCourse.school.Loop;

import java.util.Scanner;

public class whileLoopAndDoWhile {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter n value: ");
			int n= sc.nextInt();
			int i=1;
			int total=0;
			int number=0;
			int max=0;
			do {
				System.out.print("Enter number"+i+": ");
				number=sc.nextInt();
				if(max<number)
					max=number;
				total+=number;
				i++;
			}while(i<=n);
			System.out.print("Total: "+total);
			System.out.print("\nMaximum: "+max);
		}
	}
}