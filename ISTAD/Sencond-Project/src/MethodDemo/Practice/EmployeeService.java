package MethodDemo.Practice;

import java.util.Scanner;

public class EmployeeService {
    public Employee input() {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Enter id:");
        employee.id = scanner.nextInt();
        System.out.print("Enter name:");
        scanner.nextLine();
        employee.name = scanner.nextLine();
        System.out.print("Enter gender:");
        employee.gender = scanner.next();
        System.out.print("Enter position:");
        scanner.nextLine();
        employee.position = scanner.next();
        System.out.print("Enter wage:");
        scanner.nextLine();
        employee.wage = scanner.nextFloat();
        System.out.print("Enter hours:");
        employee.hours = scanner.nextFloat();
        return employee;
    }
    public void print(Employee employee) {
        System.out.println("Person ID: " + employee.id);
        System.out.println("Person Name: " + employee.name);
        System.out.println("Person Gender: " + employee.gender);
        System.out.println("Person Position: " + employee.position);
        System.out.println("Person Wage : " + employee.wage);
        System.out.println("Person Hours: " + employee.hours + (employee.hours > 1 ? "hours" : "hour"));
        //gender male = 50%
        //gender female = 30% --> only apply when salary is >=1000
        float salary = employee.findSalary();
        String gender = employee.gender;
        System.out.println(" Salary : " +
                ((salary >= 1000) ? (gender.equalsIgnoreCase("male") ?
                        salary * 0.5f : salary * 0.7f) : salary));
    }

}
