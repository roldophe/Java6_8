package VariableArguments;

public class NoVarArgument {
    public int sumNumber(int a, int b) {
        return a + b;
    }

    public int sumNumber(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        NoVarArgument obj = new NoVarArgument();
        System.out.println(obj.sumNumber(12, 22));
        System.out.println(obj.sumNumber(12, 43, 12));
    }
}
