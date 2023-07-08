package com.Radom.java.OnlineCourse.school.FirstDemo;

//import java.util.Scanner;

public class SumNumber {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Input n: ");
//		int number = sc.nextInt();
//		System.out.println("Number : "+number);
		int u1 = 1;
		int un = 5;
		// int sum = 5 * (u1 + un) / 2;
		int cardinal = un - u1 + 1;
		// cardinal: រកចំនួនធាតុ(១ដល់៧មាន៧ធាតុ)
		System.out.println("Cardinal: " + cardinal);
		int sum = cardinal * (u1 + un) / 2;
		System.out.println("Sum = " + sum);

	}

}
