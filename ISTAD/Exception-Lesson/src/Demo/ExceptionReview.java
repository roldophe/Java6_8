package Demo;

import Customexception.AgeInvalidException;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionReview {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int age;
        try {
            System.out.println("Enter your age: ");
            age=scanner.nextInt();
            if (age<0)
                throw new AgeInvalidException("Age must be positive number!!");
            System.out.println("Age is: "+age);
        }catch (Exception ex){
            //System.out.println("Input is valid. Enter integer value!");
            System.out.println("Error message is: "+ex.getMessage());
        }


        /*
         * throw-> throw object of exception class
         * 1. throw exception with custom message
         * 2. throw exception with custom class (AgeIsInvalidException)
         * 3. throw exception whenever you want!
         */
    }
}
