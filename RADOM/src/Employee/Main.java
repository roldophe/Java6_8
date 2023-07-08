package Employee;

import java.util.Scanner;
class Employee {
    private int empID;
    private String name;
    private String gender;
    private int age;
    private String position;
    private float wage;
    private float hours;

    float findSalary() {
        return wage * hours;
    }

    public Employee() {
        System.out.println("==================Constructor without parameter is invoked================");
    }
    public Employee(int empID, String name, String gender, int age, String position, float wage, float hours) {
        this.empID = empID;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.position = position;
        this.wage = wage;
        this.hours = hours;
    }
    Employee input() {
        empID = Utils.getInt("Please input id:");
        name = Utils.getStringLn("Please input full name: ");
        gender = Utils.getString("Please input gender: ");
        age = Utils.getInt("Please input age: ");
        position = Utils.getString("Please input position: ");
        wage = Utils.getFloat("Please input wage: ");
        hours = Utils.getFloat("Please input hour: ");
        return new Employee(empID, name, gender, age, position, wage, hours);
    }
    void showInformation() {
        float salary=0.0f;
        salary=findSalary();
        System.out.println("----------------------------------------------------");
        System.out.print("  \tID: " + empID);
        System.out.print("  \tName: " + name);
        System.out.print("  \tGender: " + gender);
        System.out.println("  \tAge: " + age);
        System.out.print("  \tPosition: " + position);
        System.out.print("  \tWage: " + wage + "$/h");
        System.out.println("  \tHours: " + hours + ((hours > 1) ? "hours" : "hour"));
        System.out.print("  \tSalary: " + salary + "$");
        System.out.println("\n****************************************************************");
    }
    Employee[] inputAll(int number) {
        Employee[] employees = new Employee[number];
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee[" + (i + 1) + "]:");
            employees[i] = input();
        }
        return employees;
    }
    void ShowAllInformation(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.print("Employee[" + (i + 1) + "]:");
            employees[i].showInformation();
        }
    }
    Employee findMaxSalary(Employee[] employees){
        Employee max = employees[0];
        for (Employee employee :  employees){
            if (max.findSalary()<employee.findSalary())
                max=employee;
        }
        return max;
    }
}
class Utils {
    public static String getString(String label) {
        System.out.print(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public static String getStringLn(String label) {
        System.out.print(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static int getInt(String label) {
        String text = getString(label);
        return Integer.parseInt(text);
    }

    public static float getFloat(String label) {
        String text = getString(label);
        return Float.parseFloat(text);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee  = new Employee(),max;
        employee.showInformation();
        System.out.println("..................MultiEmployee............... ");
        int number = Utils.getInt("Please input number of employee:");

        Employee[] employees = employee.inputAll(number);

        System.out.println("\t\t\t=============Show all information============");
        employee.ShowAllInformation(employees);

        max = employee.findMaxSalary(employees);
        System.out.println("MaxSalary: ");
        max.showInformation();

    }
}
