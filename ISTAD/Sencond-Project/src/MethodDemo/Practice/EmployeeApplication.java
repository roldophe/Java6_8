package MethodDemo.Practice;

import java.util.Scanner;

public class EmployeeApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService= new EmployeeService();
        Employee employee = employeeService.input();
        employeeService.print(employee);

        //creating another object
        Employee james = new EmployeeService().input();
        employeeService.print(james);

        //working with array of objects

        System.out.print("Enter number of employee: ");
        int number = scanner.nextInt();
        Employee[] employees  = new Employee[number];
    }
}

