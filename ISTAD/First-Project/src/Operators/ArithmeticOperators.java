package Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int value1 = 3;
        int value2 = 2;

//      arithmetic operators

        int sum = value1 + value2;
        int sub = value1 - value2;
        int mul = value1 * value2;
        float division = value1 / (float) value2; // value1/(float) value2;
        int modulo = value1 % value2;

        System.out.println("Sum is  :" + sum);
        System.out.println("sub is  :" + sub);
        System.out.println("Mul is  :" + mul);
        System.out.println("Division :" + division);
        System.out.println("Modulo is : " + modulo);
    }
}
