package com.Radom.java.OnlineCourse.OPP.ConstructorEmployee;

import com.Radom.java.OnlineCourse.OPP.Constructors.Book;

import java.util.Scanner;

public class EmployeeApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //EmployeeService employeeService = new EmployeeService();
//        Employee employee = employeeService.createEmployee();
//        employeeService.print(employee);

        int numberOfEmployee;
        System.out.print(" Enter number of Employee: ");
        numberOfEmployee=scanner.nextInt();
        EmployeeService employeeServices = new EmployeeService();
        Employee[] employees = employeeServices.createEmployees(numberOfEmployee);
        employeeServices.printAllData(employees);
        System.out.println("____________________________");
        System.out.println("After by Salary");
        employeeServices.sortBySalary(employees);
        employeeServices.printAllData(employees);
        System.out.println("The highest salary: \n"+employeeServices.maxSalary(employees));


    }

}
