package com.Radom.java.OnlineCourse.Basic.Function;

import java.util.Arrays;
import java.util.Scanner;

public class SearchAndSortArray {
    public static void main(String[] args) {
        System.out.print("Enter number of array: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] arrays = new int[number];
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Element[" + (i + 1) + "]:");
            arrays[i] = scanner.nextInt();
        }
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arrays));
        sort(arrays);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arrays));
        System.out.println("-------------");
        System.out.print("Enter a element you want to search: ");
        int element=scanner.nextInt();
        search(arrays,element);

    }

    static void sort(int[] value) {
        int temp;
        for (int i = 0; i < value.length; i++) {
            for (int j = i + 1; j < value.length; j++) {
                if (value[i]>value[j]){
                    temp = value[i];
                    value[i] = value[j];
                    value[j]=temp;
                }
            }
        }
    }
    static void search(int[] value,int number){
        boolean isFound=false;
        int i;
        for (i =0; i<value.length; i++){
            if (number==value[i]){
                isFound=true;
                break;
            }
        }
        if (isFound)
            System.out.println("Element is present at index["+(i+1)+"].");
        else
            System.out.println("Search not found!");

    }
}
