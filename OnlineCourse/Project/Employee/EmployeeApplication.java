package com.Radom.java.OnlineCourse.Project.Employee;

import com.Radom.java.OnlineCourse.OPP.ConstructorEmployee.Employee;
import com.Radom.java.OnlineCourse.OPP.ConstructorEmployee.EmployeeService;

public class EmployeeApplication {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		
		/*
		 * -----------------------For an Employee-------------------
		 */
		Employee createEmployees = employeeService.createEmployee();
		employeeService.print(createEmployees);
		
		//int numberOfEmployee=1;
		//EmployeeService[] createEmployee = employeeService.createEmployees(numberOfEmployee);
		//employeeService.printAllInfo(createEmployee);
		
		//employeeService.calculateBonus(employees);

	}

}
