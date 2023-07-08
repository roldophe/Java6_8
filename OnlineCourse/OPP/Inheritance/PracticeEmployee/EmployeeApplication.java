package com.Radom.java.OnlineCourse.OPP.Inheritance.PracticeEmployee;

import com.Radom.java.OnlineCourse.OPP.Inheritance.StaticKeyWordDemo.Gender;

public class EmployeeApplication {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Employee emp1 = new Employee("RADOM", Gender.MALE, 950, EmployeesType.PART_TIME);
		Employee emp2 = new Employee("KHOEM", Gender.FEMALE, 350, EmployeesType.INTERNSHIP);
		Employee emp3 = new Employee("ROLDOPHE", Gender.MALE, 500, EmployeesType.FULL_TIME);
		Employee emp4 = new Employee("LUOIZ", Gender.FEMALE, 320, EmployeesType.INTERNSHIP);
		Employee emp5 = new Employee("RANDOM", Gender.MALE, 1100, EmployeesType.FULL_TIME);

		/*
		 * System.out.println(emp1); System.out.println(emp2); System.out.println(emp3);
		 * System.out.println(emp4); System.out.println(emp5);
		 */

		Employee[] employees = new Employee[] { emp1, emp2, emp3, emp4, emp5 };

		/* ---------------------------Data all Employees--------------------------- */

		for (Employee employee : employees) {
			System.out.println(employee);
		}

		/*
		 * ------------------------ Count Employee By Gender * ------------------------
		 */

		int numberOfFemale = employeeService.countEmployeeByGender(employees, Gender.FEMALE);
		System.out.println("Number of FeMale: " + numberOfFemale);
		int numberOfMale = employeeService.countEmployeeByGender(employees, Gender.MALE);
		System.out.println("Number of Male  : " + numberOfMale);

		/*
		 * ------------------------ Calculate bonus of Employees * ---------------------
		 */

		double bonusEmp1 = employeeService.calculateBonus(emp1);
		System.out.println("Bonus Employee1: " + bonusEmp1);
		double paymentE1 = employeeService.calculateTotalPaymentOfEmployee(emp1);
		System.out.println("TotalSalary = " + paymentE1 + "$");

	}

}
