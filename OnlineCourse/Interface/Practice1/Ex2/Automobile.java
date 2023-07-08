package com.Radom.java.OnlineCourse.Interface.Practice1.Ex2;

public class Automobile implements Driveable {

	@Override
	public void startEngine() {
		System.out.println("The machine is running now");
	}

	@Override
	public void stopEngine() {

		System.out.println("The machine is stopped now");
	}

	@Override
	public void turn(String direction) {
		System.out.println("Now, the car trun " + direction);
		// return false;
	}

	@Override
	public void accelerate(double acc) {
		System.out.println("The car speed add " + acc + " more! Please drive carefully!");
	}

}
