package com.Radom.java.OnlineCourse.OPP.ConstructorEmployee;

import java.util.Scanner;

public class EmployeeService {
    Employee[] createEmployees(int numberOfEmployee){
        Employee[] employees = new Employee[numberOfEmployee];
        for (int i=0; i<employees.length; i++){
            employees[i]=createEmployee();
        }
        return employees;
    }
    public Employee createEmployee(){
        String name = Utils.getString("Please input name: ");
        String gender = Utils.getString("Please input gender: ");
        double salary = Utils.getDouble("Please input salay: ");
        return new Employee(name,gender, salary);
    }

    public void printAllData(Employee[] employees){// Print Arrays
        for (Employee employee : employees)
            System.out.println(employee.toString());
    }
    //print simple
    public void print(Employee employee){
        System.out.println(employee.toString());
    }
    public void sortBySalary(Employee[] employees){
        for (int i=0; i<employees.length; i++){
            for (int j=i+1; j<employees.length; j++){
                if (employees[i].getSalary()<employees[j].getSalary()){
                    Employee temp = employees[i];
                    employees[i]=employees[j];
                    employees[j]=temp;
                }
            }
        }
    }
    public Employee maxSalary(Employee[] employees){
        Employee MaxSal=employees[0];
        for (int i=1; i<employees.length; i++){
            if (MaxSal.getSalary()<employees[i].getSalary()){
                MaxSal=employees[i];
            }
        }
        return MaxSal;
    }
}
