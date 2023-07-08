package Demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valueA, valueB;
        try {
            System.out.println("Enter valueA: ");
            valueA = scanner.nextInt();
            System.out.println("Enter valueB: ");
            valueB = scanner.nextInt();
            float result = valueA / valueB;
            System.out.println("Result: " + result);
        } catch (InputMismatchException | ArithmeticException ex) {
            //ex.printStackTrace();
            System.out.println("Error! Message is:  " + ex.getMessage());
        }
        System.out.println("Normal line of code!!");
    }
}
