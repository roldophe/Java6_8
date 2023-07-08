package LambdaReview;

interface WithParamsDemo {
    //    void print(Integer p1, Integer p2);
    //int operator(int a, int b);
    void getMessage();
}

public class Test2 {
    //    static void fun(WithParamsDemo d1, Integer p1, Integer p2) {
//        d1.print(p1, p2);
//    }
    public static void main(String[] args) {
        // fun((p1, p2) -> System.out.println(p1 + " " + p2), 10, 20);
//        WithParamsDemo addition = (a, b) -> a + b;
//        WithParamsDemo multiply = (x, y) -> x * y;
//        System.out.println("Addition: " + addition.operator(10, 20));
//        System.out.println("Multiplication: " + multiply.operator(5, 2));

        WithParamsDemo obj = () -> System.out.println("Hello, I'm an abstract method");
        obj.getMessage();
    }
}
