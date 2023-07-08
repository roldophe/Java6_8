package InnerClass.StaticDemo;

class Outer {
    int outerValue;
    String outerMessage;
    //static variable
    static String outerStaticMessage = "This is static message from outer class.";

    void outerMessage() {
        System.out.println("Outer value: " + outerValue);
        System.out.println("Outer message: " + outerMessage);
    }

    //  inner class as a static
    static class InnerClass {
        int innerValue;
        String innerMessage;

        void innerMethod() {
            System.out.println("Outer value is: " + outerStaticMessage);
            System.out.println("Inner value is: " + innerValue);
            System.out.println("Inner message is : " + innerMessage);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //in order to create an inner object
        Outer.InnerClass outerInner = new Outer.InnerClass();
        outerInner.innerMessage="This is in message.";
        outerInner.innerValue=99;
    }
}
