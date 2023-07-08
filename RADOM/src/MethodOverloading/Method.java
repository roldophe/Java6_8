package MethodOverloading;

import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
        printString("Welcome to cambodia!");
        //print number(int)
        printInteger(3);

        print("RADOM KHOEM");

        print(7);
        print("Age", 23);

        int[] arrays = {12, 43, 23, 55};
        print(arrays);

        printNumber(12, 45, 36, 19);
        print("RADOM", "ROLDOPHE");

        display("Coca",1.2,1.8,3);
        display("Book","JAVA","C++","Spring");

    }

    public static void printString(String text) {
        //print string(text)
        System.out.println(text);


    }

    public static void printInteger(Integer number) {
        System.out.println(number);
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void print(Integer number) {
        System.out.println(number);
    }

    public static void print(String property, int number) {
        System.out.println(property + " = " + number);
    }

    public static void print(int[] numbers) {
        //System.out.println(Arrays.toString(numbers));
        for (int number : numbers) {
            System.out.print(" " + number);
        }
        System.out.println();
    }
//  varArg
    public static void print(String... names) {
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name["+(i+1)+"]: ");
            System.out.println(names[i]);
        }
        //System.out.println(Arrays.toString(name));
    }
    public static void printNumber(int... numbers) {
        System.out.println(Arrays.toString(numbers));
    }
    public static void display(String name, double...price){
        System.out.println(name);
        for (double p: price){
            System.out.println(p+"$");
        }
    }
    public static void display(String property, String...title){
        System.out.println(property);
        for (String t: title){
            System.out.println(t);
        }
    }

}
