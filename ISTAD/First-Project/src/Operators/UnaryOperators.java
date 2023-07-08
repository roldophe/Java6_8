package Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        //Unary operators
        int value1 = 10;
        int value2 = 10;

        System.out.println("Here is the value1: " + (value1));
        System.out.println("Here is the value2: " + (value2));

        int result1 = ++value1;
        int result2 = value2++;
        System.out.println("Here is the result1: " + result1);
        System.out.println("Here is the result2: " + result2);
    }
}
