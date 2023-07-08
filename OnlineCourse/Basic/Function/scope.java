package com.Radom.java.OnlineCourse.Basic.Function;

public class scope {
    public static void main(String[] args) {
        // CODE CANNOT USE X
        int x = 5;
        //CODE CAN USE X
        System.out.println(x);
        System.out.println("------------------");

        //Code here cannot use y
        {//this a block
            // Code here cannot use y
            int y = 9;
            //code here can use y
            System.out.println(y);
        }//The block ends here
        //Code here CANNOT use y
    }
}
