package com.Radom.java.OnlineCourse.Project.Employee;

import java.util.Objects;

public class EmployeeService {
	public Employee createEmployee() {
		String Name = Utils.getString("Please input name: ");
		String Gender = Utils.getString("Please input gender: ");
		double Salary = Utils.getDouble("Please input salary: ");
		String employeeType = Utils.getString("Please input employee type: ");
		Employee emp = new Employee(Name, Gender, Salary, employeeType);
		return emp;
	}

	public Employee[] createEmployees(int n) {
		Employee[] employees = new Employee[n];
		for (int i = 0; i < n; i++) {
			employees[i] = createEmployee();
			employees[i]=calculateBonus(employees);
		}
		return employees;
	}


	public Employee calculateBonus(Employee[] employees) {
		// TODO Auto-generated method stub
		return null;
	}

	public double calculateBonus(Employee employees) {
		double bonus = 0.0;
		switch (employees.getEmployeeType()) {
		case "FULL_TIME":
			bonus = employees.getSalary() * 0.5;
			break;
		case "PART_TIME":
			bonus = employees.getSalary() * 0.3;
			break;
		case "INTERNSHIP":
			bonus = employees.getSalary() * 0.2;
			break;
		}
		return bonus;
	}

	public void printAllInfo(Employee[] employees) {
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
	}

	public void print(Employee createEmployee) {
		System.out.println(createEmployee.toString());
	}

	public int countEmployeeByGender(Employee[] employees, String gender) {
		int countGender = 0;
		for (Employee employees2 : employees) {
			if (Objects.equals(employees2.getGender(), gender)) {
				countGender++;
			}
		}
		return countGender;
	}

}
