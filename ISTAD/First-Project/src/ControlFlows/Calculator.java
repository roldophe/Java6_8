package ControlFlows;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int value1 = 20;
        int value2 = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter operation(+,-,*,/): ");
        char operator = scanner.next().charAt(0);

        int Result = switch (operator) {
            case '+' -> {
                System.out.println(value1 + " + " + value2);
                yield value1 + value2;
            }
            case '-' -> {
                System.out.println(value1 + " - " + value2);
                yield value1 - value2;
            }
            case '*' -> {
                System.out.println(value1 + " * " + value2);
                yield value1 * value2;
            }
            case '/' -> {
                System.out.println(value1 + " / " + value2);
                yield value1 / value2;
            }
            default -> 0;
        };
        System.out.println("Result: " + Result);
    }
}
