package com.Radom.java.OnlineCourse.Test;

public class TestApp {

	public static void main(String[] args) {
		int numberOfBook = 1;
		TestService testService = new TestService();
		Test[] tests = testService.createTests(numberOfBook);
		testService.getinfo(tests);

	}

}
