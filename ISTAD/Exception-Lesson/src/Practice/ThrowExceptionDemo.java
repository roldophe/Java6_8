package Practice;

import Customexception.Utils;

import java.util.Scanner;

public class ThrowExceptionDemo {
    static int division(int a, int b){
        if (b==0) throw new ArithmeticException("b cannot be zero!! Infinite value");
        //if throw new ExceptionObject!

        return a/b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a value : ");
//        int a = scanner.nextInt();
//        System.out.println("Enter a value: ");
//        int b = scanner.nextInt();
        try {
            int result = Utils.division();
            System.out.println("Result: "+result);
        }catch (ArithmeticException | IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
        System.out.println("This is the code below the division() method");
    }
}
