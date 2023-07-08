package ControlFlows;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year, months = 0;
        System.out.println("\t1.  January   2.  February");
        System.out.println("\t3.  March     4.  April ");
        System.out.println("\t5.  May       6.  June");
        System.out.println("\t7.  July      8.  August");
        System.out.println("\t9.  September 10. October");
        System.out.println("\t11. November  12. December");
        while (true) {
            System.out.println("Please chose one option: ");
            months = scanner.nextInt();
            if (months >= 1 && months <= 12) break;
            System.out.println("Invalid months.");
        }
        System.out.println("Please input year: ");
        year = scanner.nextInt();
        int day = switch (months) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> (year % 4 == 0) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 0;
        };
        System.out.println("Month = " + months + " has " + day + "days");
    }
}
