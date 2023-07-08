package Customexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    //Create a method signature with exception
    public static int division() throws IncompatibleClassChangeError, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a valueA: ");
        int a = scanner.nextInt();
        System.out.println("Enter a valueB: ");
        int b = scanner.nextInt();
        if (b==0) throw new ArithmeticException("B cannot be zero.");
        return a/b;
    }
}
