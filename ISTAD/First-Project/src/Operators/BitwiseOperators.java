package Operators;

public class BitwiseOperators {
    public static void main(String[] args) {

        // <<(left shift)
        int value = 10;
        System.out.println(value+ " Convert to binary "+Integer.toBinaryString(value));
        int result = value<<2;
        System.out.println(result+" Convert to binary is "+Integer.toBinaryString(result));
        System.out.println("result is  : "+result);

        // , >> (right shift)
        int value1 = 9;
        System.out.println(value+ " Convert to binary "+Integer.toBinaryString(value1));
        int result1 = value>>2;
        System.out.println(result+" Convert to binary is "+Integer.toBinaryString(result1));
        System.out.println("result is  : "+result1);

        //~ tilde
//      to find result of -N , we use -(N+1) formula

        int value3 = 123;
        int result3 = ~(value3);
        System.out.println("Original value3 : ");
        System.out.println(value3+" -> "+Integer.toBinaryString(value3));
        System.out.println("Altered value3 : ");
        System.out.println(result3+" -> "+Integer.toBinaryString(result3));

    }
}
