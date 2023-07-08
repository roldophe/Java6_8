package com.Radom.java.OnlineCourse.Basic.Function;

public class findMaxTwoValue {
    public static void main(String[] args) {
        int value1=3;
        int value2=5;
        System.out.println("Maximum: "+findMax(value1,value2));

    }
    static  int findMax(int value1, int value2){
        //return Math.max(value1, value2);
        if (value1>value2)
            return value1;
        else
            return value2;

    }

}
