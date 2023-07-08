/*
 * Practice:
 * There are 3 types of employee(id, name, gender, salary): full_time, part_time, internship;
 * create 5 obj obj employees(id increase automatically)
 * count female employee
 * calculate bonus of employee (full_time5%, part_time3%, internshp 2%);
 * show total payment for each employee (salary +bonus);
 * calculate total payment for all employees
 */

package com.Radom.java.OnlineCourse.Project.Employee;

public class Employee {
	private int id;
	private String name;
	private String gender;
	private double salary;
	private String employeeType;
	private static int count = 0;

	public Employee(String name, String gender, double salary, String employeeType) {
		count++;
		this.id = count;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.employeeType = employeeType;
	}

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", employeeType="
				+ employeeType + "]";
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



	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public static void setCount(int count) {
		Employee.count = count;
	}

	public int getCount() {
		return count;
	}

}
