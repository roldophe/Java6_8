package ControlFlows;

import java.text.NumberFormat;
import java.util.Scanner;

public class EmployeePractice1 {
    public static void main(String[] args) {
        /*
         *          name
         *          gender
         *          wage ->
         *          hours
         *          tax
         *          salary > 1000
         *          female-> tax = 30%
         *          male -> tax = 50%
         */
        Scanner scanner = new Scanner(System.in);
        String name;
        String gender;
        int hours;
        float wage;
        float grossSalary;
        float deduction ;
        float netSalary;
        float tax;
        byte PERCENT = 100;
        System.out.print("Please enter worker's name: ");
        name = scanner.nextLine();
        while (true) {
            System.out.print("Please enter worker's gender: ");
            gender = scanner.next();
            if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male"))
                break;
            System.out.println("Invalid gender!.");
        }
        System.out.print("Please enter in your hourly wage : $");
        wage = scanner.nextFloat();
        System.out.print("Please enter the amount of hours worked : ");
        hours = scanner.nextInt();

        grossSalary = wage * hours;
        if (grossSalary >= 1000) {
            if (gender.equalsIgnoreCase("female"))
                tax = 30.0F;
             else
                tax = 50.0F;
        } else {
            tax = 0.0F;
        }
        deduction = grossSalary * tax / PERCENT;
        netSalary = grossSalary - deduction;
        System.out.println("=======Employee Information========");
        System.out.println("Name : " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Wage: $" + wage);
        System.out.println("Hour: " + hours + ((hours > 1) ? " hours" : " hour"));
        System.out.println("The gross salary is : "
                + NumberFormat.getCurrencyInstance().format(grossSalary)
                + (" [Tax(" + tax + "%)]."));
        System.out.println("The total deductions are :"
                + NumberFormat.getCurrencyInstance().format(deduction));
        System.out.println("The net salary is : "
                + NumberFormat.getCurrencyInstance().format(netSalary)
                + ((netSalary % 2 == 0) ? " even number" : " odd number"));

    }
}
