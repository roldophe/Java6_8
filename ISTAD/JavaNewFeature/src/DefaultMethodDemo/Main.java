package DefaultMethodDemo;

@FunctionalInterface
interface IUtils {
    int calculation(int a, int b, int c);

    default float division(float a, float b) {
        System.out.println("This is default function form IUtils.");
        return a / b;
    }
}

class Utils implements IUtils {

    @Override
    public int calculation(int a, int b, int c) {
        return a + b + b;
    }

    @Override
    public float division(float a, float b) {
        System.out.println("Division overridden by child class!");
        //IUtils.super.division(10,20);
        return (a / b) * 3.14f;
    }
}

public class Main {
    public static void main(String[] args) {
//        Utils obj = new Utils();
//        int calculateResult=obj.calculation(12,34,56);
//        System.out.println("Result : "+calculateResult);
//        float div=obj.division(21,7);
//        System.out.println("Result: "+div);

        //Using lambda
        IUtils obj = (a, b, c) -> a + b + c;
        int result = obj.calculation(10, 20, 30);
        System.out.println("Result: " + result);
        float result1 = obj.division(10, 20);
        System.out.println(result1);
    }
}
