package com.Radom.java.OnlineCourse.Basic.Function;

public class Recursion {
    public static int sum(int start, int end) {
        if (end > start)
            return end + sum(start, end - 1);
        return end;
    }

    public static void main(String[] args) {
        int result = sum(1, 5);
        System.out.println("Sum = " + result);
    }
}
