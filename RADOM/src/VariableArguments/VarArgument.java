package VariableArguments;

public class VarArgument {
    public int sumNumber(int... args) {
        System.out.println("arguments length: " + args.length);
        int sum = 0;
        for (int x : args) {
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        VarArgument varArgument = new VarArgument();
        int sum1 =  varArgument.sumNumber(2,3,5);
        System.out.println("Sum: "+sum1);

        int sum2 =  varArgument.sumNumber(4,3,2,8,7);
        System.out.println("Sum: "+sum2);

        int sum3 =  varArgument.sumNumber(7,8,4,9,5,11);
        System.out.println("Sum: "+sum3);


    }
}
