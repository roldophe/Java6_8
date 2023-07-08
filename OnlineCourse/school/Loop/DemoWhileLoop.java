package com.Radom.java.OnlineCourse.school.Loop;

import java.util.Scanner;

public class DemoWhileLoop {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num=2;
			String input="";
			while(true)
			{
				System.out.println(num+"");
				System.out.print("Cout Contionu?(Y or N)");
				input=sc.next();
				if(input.equalsIgnoreCase("N"))break;
				num+=1;
			}
		}
		System.out.println("closed");
	}

}
