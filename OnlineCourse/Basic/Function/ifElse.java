package com.Radom.java.OnlineCourse.Basic.Function;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        checkAge(age);
    }
    public static void checkAge(int age) {
        if (age >= 18)
            System.out.println("Access granted - You are old enough!");
        else
            System.out.println("Access denied - You are not old enough!");
    }
}
