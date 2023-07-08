package LambdaReview;

interface FuncInter1 {
    //operation is implement using lambda expressions
    int operation(int a, int b);
}

interface FuncInter2 {
    void sayMessage(String message);
}

public class WithParams {
    private int operator(int a, int b, FuncInter1 fobj1) {
        return fobj1.operation(a, b);
    }

    public static void main(String[] args) {
        //Lambda expression for addition for two parameter
        //data type for x and is optional.
        //This expression implements 'FuncInter1' interface
        FuncInter1 add = (int x, int y) -> x + y;

        //Lambda expression for multiplication for two parameters.
        //This expression also implements
        //'FuncInter1' interface
        FuncInter1 multiply = (int x, int y) -> x * y;

        //Creating an object of WithParams to call operate using
        //different implementations using lambda
        //Expressions
        WithParams obj = new WithParams();
        //Add two numbers using lambda expression
        System.out.println("Addition is " + obj.operator(12, 32, add));
        //Multiply two numbers using lambda expression
        System.out.println("Multiplication is " + obj.operator(5, 5, multiply));


        //lambda expression for single parameter
        //This expression implements 'FuncInter2' interface
        FuncInter2 fobj2 = message -> System.out.println("Hello " + message);
        fobj2.sayMessage("Geek");
    }
}
