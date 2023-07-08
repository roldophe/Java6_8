package com.Radom.java.OnlineCourse.Interface.Practice2.Pologon;

public interface Polygon extends Area, Perimeter{

	public void draw();
	
	default void info() {
		System.out.println("It is from polygon");
		test2();
	}
	static void test() {
		System.out.println("Test");
	}
	private void test2() {
		System.out.println("Test2");
	}
}
