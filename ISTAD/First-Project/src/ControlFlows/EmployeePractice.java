package ControlFlows;

import java.text.NumberFormat;
import java.util.Scanner;
//What you think , you become
public class EmployeePractice {
    public static void main(String[] args) {
        /*
         * name
         * gender
         * wage ->
         * hours
         *
         * tax
         * salary > 1000
         *        female-> tax = 30%
         *        male -> tax = 50%
         */
        Scanner scanner = new Scanner(System.in);
        String name;
        String gender;
        int wage;
        int hours;
        float salary;
        System.out.print("Enter worker's name: ");
        name = scanner.nextLine();
        while (true) {
            System.out.print("Enter worker's gender: ");
            gender = scanner.next();
            if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male"))
                break;
            System.out.println("Invalid gender!.");
        }

        System.out.print("Enter wage : $");
        wage = scanner.nextInt();
        System.out.print("Enter Hours: ");
        hours = scanner.nextInt();
        salary = wage * hours;
        if (salary >= 1000) {
            if (gender.equalsIgnoreCase("female")) {
                salary = salary - (float) (salary * 0.30);
            } else {
                salary = salary - (float) (salary * 0.50);
            }
        }

        System.out.println("=======Employee Information========");
        System.out.println("Name : " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Wage: $" + wage);
        System.out.println("Hour: " + hours + ((hours > 1) ? " hours" : " hour"));
        System.out.println("Salary: " + NumberFormat.getCurrencyInstance().format(salary)
                + ((salary % 2 == 0) ? " even number" : " odd number"));
        if (hours * wage >= 1000) {
            if (gender.equalsIgnoreCase("female")) {
                System.out.println("Tax = 30%" + "(" + hours * wage * 0.3f + ")");
            } else {
                System.out.println("Tax = 50%" + "($" + hours * wage * 0.5f + ")");
            }
        }
    }
}
