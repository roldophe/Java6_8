package com.Radom.java.OnlineCourse.Basic.Constrol;

public class DemoSwitch {

	public static void main(String[] args) {
		int DayNumber = 6;
		String DayName = "";
		switch (DayNumber) {
		case 1:
			DayName = "Monday";
			break;
		case 2:
			DayName = "Tuesday";
			break;
		case 3:
			DayName = "Wednesday";
			break;
		case 4:
			DayName = "Thursday";
			break;
		case 5:
			DayName = "Frday";
			break;
		case 6:
			DayName = "Saturday";
			break;
		case 7:
			DayName = "Sunday";
			break;
		default:
			System.out.print("Invalid day numer");
			break;
		}
		System.out.print(DayName);
	}
}
