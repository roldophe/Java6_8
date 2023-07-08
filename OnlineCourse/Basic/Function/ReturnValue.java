package com.Radom.java.OnlineCourse.Basic.Function;

public class ReturnValue {
    public static void main(String[] args) {
        //System.out.println(myMethod(3,4));
        int z = myMethod(3, 4);
        System.out.println(z);
    }

    public static int myMethod(int x, int y) {
        return y + x;
    }
}
