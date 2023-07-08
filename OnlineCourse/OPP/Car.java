package com.Radom.java.OnlineCourse.OPP;

public class Car {
	String color;
	int numberOfWheel;
	double price;
	boolean isDriving;

	void drive() {
		System.out.println(isDriving);
	}

	void info1() {
		System.out.println("V1 Color: " + color + "; NumberOfWheel: " + numberOfWheel + "; Price: " + price + "$");
	}

	void info2() {
		System.out.println(
				"V2 \nColor: %s \nNumber of wheel: %d \nPrice: %.2f $$".formatted(color, numberOfWheel, price));
	}

	void drive1() {
		isDriving = true;
		drive();
	}

	void drive2() {
		isDriving = false;
		drive();
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.color = "Red";
		car.numberOfWheel = 4;
		car.price = 20000;
		car.drive1();
		car.drive2();
		// car.info1();
		// car.info2();
	}

}
