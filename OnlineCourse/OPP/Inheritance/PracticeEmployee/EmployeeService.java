package com.Radom.java.OnlineCourse.OPP.Inheritance.PracticeEmployee;

import com.Radom.java.OnlineCourse.OPP.Inheritance.StaticKeyWordDemo.Gender;

public class EmployeeService {
	public void displayInfo(Employee[] employees) {
		for(Employee employee:employees)
		{
			System.out.println(employee.toString());
		}
	}

	public double calculateBonus(Employee employee) {
		double bonus=0.0;
		switch(employee.getEmployeesType()) {
		case FULL_TIME:  bonus = employee.getSalary() * 0.05; break;
		case PART_TIME:  bonus = employee.getSalary() * 0.03; break;
		case INTERNSHIP:  bonus = employee.getSalary() * 0.02; break;
		}
		return bonus;
	}
	public double calculateTotalPaymentOfEmployee( Employee employee) {
		double payment = employee.getSalary() +calculateBonus(employee);
		return payment;
	}
	/// **********************///
	// Count Employee By Male //
	/// **********************///

	/*
	 * public int countFemaleEmployee(Employee[] employees) { int total = 0; for
	 * (Employee employee : employees) { if (employee.getGender() == Gender.FEMALE)
	 * { total++; } } return total; }
	 * 
	 * public int countMaleEmployee(Employee[] employees) { int total = 0; for
	 * (Employee employee : employees) { if (employee.getGender() == Gender.MALE) {
	 * total++; } } return total; }
	 */

	public int countEmployeeByGender(Employee[] employees, Gender gender) {
		int total = 0;
		for (Employee employee : employees) {
			if (employee.getGender() == gender) {
				total++;
			}
		}
		return total;
	}
}