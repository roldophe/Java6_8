package com.Radom.java.OnlineCourse.school.Function;

public class Recursion {

	public static void main(String[] args) {
		int a=105;
		int b=30;
		System.out.println("("+a+"+"+b+"): "+sum(a,b));
		System.out.print("("+a+"*"+b+"): "+mul(a,b));

	}
	public static int sum(int a, int b) {
		if(b==0)
			return a;
		else
			return sum(a,b-1)+1;
	}
	public static int mul(int a, int b) {
		if(b==0)
			return 0;
		else
			return mul(a,b-1)+a;
	}

}
