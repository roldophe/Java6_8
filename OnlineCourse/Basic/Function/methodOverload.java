package com.Radom.java.OnlineCourse.Basic.Function;

public class methodOverload {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNumber1 = plusMethod (8, 5);
        double myNumber2 = plusMethod (3.4, 5.23);
        System.out.println("int: " + myNumber1);
        System.out.println("double: " + myNumber2);
    }
}
