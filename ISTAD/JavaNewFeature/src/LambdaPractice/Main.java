package LambdaPractice;

@FunctionalInterface
interface IUtils {
    int calculate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        IUtils obj = (int a, int b) -> a + b;
        IUtils obj1 = (a, b) -> a + b;
        IUtils obj2 = (int a, int b) -> {
            return a + b;
        };
        System.out.println("Obj:::");
        System.out.println(obj.calculate(5, 5));
        System.out.println("Obj1:::");
        System.out.println(obj1.calculate(10, 10));
        System.out.println("Obj2:::");
        System.out.println(obj2.calculate(90, 90));
    }
}
