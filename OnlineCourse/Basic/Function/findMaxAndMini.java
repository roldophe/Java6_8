package com.Radom.java.OnlineCourse.Basic.Function;

import java.util.Scanner;

public class findMaxAndMini {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfArray;
        System.out.print("Enter number of arrays: ");
        numberOfArray = scanner.nextInt();
        int[] arrays = new int[numberOfArray];
        System.out.println("Enter the element of arrays: ");
        for (int i = 0; i < numberOfArray; i++) {
            System.out.print("Element[" + (i + 1) + "]: ");
            arrays[i] = scanner.nextInt();
        }
        int max = Maximum(arrays);
        System.out.println("Maximum: " + max);
        int mini = Minimum(arrays);
        System.out.println("Minimum: " + mini);
    }

    static int Maximum(int[] value1) {
        int max = value1[0];
        for (int i = 1; i < value1.length; i++) {
            if (max < value1[i])
                max = value1[i];
        }
        return max;
    }

    static int Minimum(int[] value2) {
        int mini = value2[0];
        for (int i = 1; i < value2.length; i++) {
            if (mini > value2[i])
                mini = value2[i];
        }
        return mini;
    }
}
