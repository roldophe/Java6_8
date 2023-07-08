package com.Radom.java.OnlineCourse.school.Loop;

public class LabeledBreakStatement {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// the for loop is labeled as first
		first: for (int i = 1; i < 5; i++) {

			second: for (int j = 1; j < 3; j++) {
				System.out.println("i=" + i + "j=" + j);
				if (i == 2) {
					break second;
					// break first;}
				}
			}

		}

	}
}