package com.Radom.java.OnlineCourse.OPP.ClassEmployees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeesApp {

	public static void main(String[] args) throws IOException{
		
		//calling constructor and assign value
		Employees emp= new Employees("RADOM KHOEM", "M", 21);
		emp.displayDetails();
		
		//setData from user
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Your Name: ");
		String name = reader.readLine();
		System.out.print("Enter Your Sex : ");
		String sex = reader.readLine();
		System.out.print("Enter Your Age : ");
		int age = Integer.parseInt(reader.readLine());
		
		
		//assign value from user
		Employees emp1 = new Employees(name,sex, age);
		emp1.displayDetails();
	}

}
