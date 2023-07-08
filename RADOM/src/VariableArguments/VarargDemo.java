package VariableArguments;

public class VarargDemo {
    //A method that takes variables
    //number of integer  arguments
    static void fun(int... a){
        System.out.println("Number of arguments: " +a.length);
        //using for each loop to display contents of a
        for(int i:a)
            System.out.println(i+" ");
        System.out.println();
    }
    //Driver code
    public static void main(String[] args) {
        // calling the varargs method with
        //difference number of parameters

        //one parameter
        fun(100);
        //no parameter
        fun();
    }

}
