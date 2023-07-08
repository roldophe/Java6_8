package Demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your value: ");
            int value = scanner.nextInt();
            //System.out.println("Value is: " + value);
            int result = 12/value;
            System.out.println("Result: "+result);
        } catch (InputMismatchException ex) {
            System.out.println("Value input type is mismatched.");
            //ex.printStackTrace();

//            System.out.println("Get caused: "+ex.getCause());
//            System.out.println("Exception Error: "+ex.getMessage());
//            System.out.println("Exception Error II: "+ex.getLocalizedMessage());
            //System.out.println("Error! User input invalid data!!");
        }
        catch (ArithmeticException ex){
            System.out.println("Value can be divided by zero.");
        }
        catch (Exception ex){
            System.out.println("Any exceptions will be handle here.");
        }

        System.out.println("This is a regular message");
    }
}
