package InnerClass.InnerClass.NormalDemo;

class OuterClass {
    int outerValue;
    String outerMessage;
    static String staticOuterMessage = "Static Outer message";
    void OuterMethod() {
        System.out.println("Value of outer value: " + outerValue);
        System.out.println("Value of outer message: " + outerMessage);
    }
    class InnerClass {
        int innerValue;
        String innerMessage;
        static String staticInnerMessage = "Inner Message";

        void innerMethod() {
            System.out.println("*******************************************");
            System.out.println("Static Outer message: " + staticOuterMessage);
            System.out.println("Static Inner message: " + staticInnerMessage);
            System.out.println("Value of outer value: " + outerValue);
            System.out.println("Value of outer message: " + outerMessage);
            System.out.println("value of inner Value: " + innerValue);
            System.out.println("value of inner message: " + innerMessage);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //There are two ways that we can create the inner object;
        OuterClass outerClass = new OuterClass();
        outerClass.outerMessage = "Instance outer message";
        outerClass.outerValue = 99;
        OuterClass.InnerClass outerInnerClass = outerClass.new InnerClass();
        outerInnerClass.innerMessage = "Instance inner message";
        outerInnerClass.innerValue = 93;
        outerInnerClass.innerMethod();


        //second way
        OuterClass.InnerClass innerObj2 = new OuterClass().new InnerClass();
        innerObj2.innerValue=34;
        innerObj2.innerMessage="Inner message";
        innerObj2.innerMethod();
    }
}
