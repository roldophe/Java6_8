package com.Radom.java.OnlineCourse.Basic.Constrol;

//import java.util.Scanner;

public class DemoIf___Else {
	public static void main(String[] args) {
		float score=65;
		char grade = 'F';
/*		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your score(0-100): ");
		score = sc.nextFloat();
*/
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else if (score >= 50) {
			grade = 'E';
		} else {
			grade = 'F';
		}

		System.out.println("Grade: " + grade);

	}

}
