package LambdaReview;

@FunctionalInterface
interface Test1 {
    void print();
}

public class LambdaWithNoParams {
    //functional interface parameter is passed
    static void fun(Test1 t) {
        t.print();
    }

    public static void main(String[] args) {
//        Test1 t1 =()-> System.out.println("Hello!");
//        t1.print();
//
//        Test1 obj = new Test1() {
//            @Override
//            public void print() {
//                System.out.println("Hello dear!");
//            }
//        };
//        obj.print();
//        fun(obj);

        fun(() -> System.out.println("Hello"));

    }
}
