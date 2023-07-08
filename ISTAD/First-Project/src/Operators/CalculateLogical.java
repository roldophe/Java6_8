package Operators;

public class CalculateLogical {
    public static void main(String[] args) {

//  convert value1 and value2 to binary and then calculate to Decimal

//  Bitwise AND
        int value1 = 15;                  //   1111
        int value2 = 10;                 //    1010
        int result1 = value1 & value2;  //     1010 = 8+2 = 10
        System.out.println("Result1 : " + result1);

//  Bitwise OR
        value1 = 10;                       //  1010
        value2 = 9;                       //   1001
        int result2 = value1 | value2;   //    1011 = 8+2+1 = 11
        System.out.println("Result2 : " + result2);

//  Bitwise exclusive OR
        value1 = 15;                       //  1111
        value2 = 10;                      //   1010
        int result3 = value1 ^ value2;   //    0101 = 4+1 = 5;
        System.out.println("Result3 : " + result3);


    }

}
