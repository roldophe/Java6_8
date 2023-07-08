package com.Radom.java.OnlineCourse.Interface.Practice1.Ex1;

public class DemoSeries {

	public static void main(String[] args) {
		ByTwos obj = new ByTwos();
		for (int i = 0; i < 10; i++) {
			System.out.println(obj.getNext() + " ");
		}
		System.out.println();
		System.out.println("Resetting the value");
		obj.reset();
		for (int i = 0; i < 10; i++) {
			System.out.println(obj.getNext() + " ");
		}
		System.out.println();
		System.out.println("Setting the start value");
		obj.setStart(23);

		for (int i = 0; i < 10; i++) {
			System.out.println(obj.getNext() + " ");
		}
	}

}
