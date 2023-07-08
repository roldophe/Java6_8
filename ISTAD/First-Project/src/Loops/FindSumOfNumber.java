package Loops;

public class FindSumOfNumber {
    public static void main(String[] args) {

        //Detail: https://www.vedantu.com/maths/consecutive-integers
        int number = 4;
        int total=0;
        int i;
        System.out.println("For odd consecutive integers");
        for(i=0; i< number; i++)
        {
            System.out.print("\t"+(2*i+1));
            total+=(2*i+1);
        }
        System.out.println();
        System.out.println("Result : "+total);

        System.out.println("For Even consecutive integers");
        total=0;
        for(i=1; i<= number; i++)
        {
            System.out.print("\t"+(2*i));
            total+=(2*i);
        }
        System.out.println();
        System.out.println("Result : "+total);


    }
}
