package VariableArguments;

import java.util.Arrays;

public class VarargOverload {
    private void test(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        System.out.println(Arrays.toString(args));
        System.out.println("sum: " + sum);
    }

    private void test(boolean p, String... args) {
        boolean negate = !p;
        System.out.println("negate: " + negate);
        System.out.println("args.length: " + args.length);
    }

    public static void main(String[] args) {
        VarargOverload varargOverload = new VarargOverload();
        varargOverload.test(1, 2, 4);
        varargOverload.test(true, "hello", "world");
    }
}
