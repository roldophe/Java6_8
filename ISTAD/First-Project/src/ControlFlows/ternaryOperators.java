package ControlFlows;

public class ternaryOperators {
    public static void main(String[] args) {
        // ternary operators ?:
        int value1=10, value2 =20, max=0;
        max = (value1>value2)? value1:value2;
        System.out.println("Max: "+max);
    }
}
