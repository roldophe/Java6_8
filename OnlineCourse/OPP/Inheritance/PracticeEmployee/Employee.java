package com.Radom.java.OnlineCourse.OPP.Inheritance.PracticeEmployee;

import com.Radom.java.OnlineCourse.OPP.Inheritance.StaticKeyWordDemo.Gender;

public class Employee {
	private int id;
	private String name;
	private Gender gender;
	private double salary;
	private EmployeesType employeesType;
	
	private static int count = 0;

	public Employee(String name, Gender gender, double salary, EmployeesType employeesType) {
		count++;
		this.id=count;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.employeesType = employeesType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public EmployeesType getEmployeesType() {
		return employeesType;
	}

	public void setEmployeesType(EmployeesType employeesType) {
		this.employeesType = employeesType;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Employee.count = count;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary
				+ ", employeesType=" + employeesType + "]";
	}
	


}
