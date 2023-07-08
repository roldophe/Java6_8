package MethodReference;

//this is a functional interface
interface MyInterface {
    //abstract method
    double getPiValue();
}

public class LambdaPracticeII {
    public static void main(String[] args) {
        //declare a reference to MyInterface
        MyInterface ref;

        //'MyInterface' is abstract; cannot be instantiated
        //    MyInterface ref1 = new MyInterface();
        //lambda expression
        ref = () -> 3.1415;
        System.out.println("Value of PI: " + ref.getPiValue());

    }
}
