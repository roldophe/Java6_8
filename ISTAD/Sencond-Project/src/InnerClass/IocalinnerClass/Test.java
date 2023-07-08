package InnerClass.IocalinnerClass;

class Outer {
    int outerValue;
    String outerMessage;

    void outerMessage() {
        System.out.println("Outer value: " + outerValue);
        System.out.println("Outer message: " + outerMessage);
        class LocalInnerClass {
            int innerValue;
            String innerMessage;

            void innerMethod() {
                System.out.println("***********************");
                System.out.println("Outer Value is : "+outerValue);
                System.out.println("Inner value: " + innerValue);
                System.out.println("Inner message: " + innerMessage);
                System.out.println("Local inner method!!");
            }
        }
        LocalInnerClass l = new LocalInnerClass();
        l.innerValue = 23;
        l.innerMessage = "Local inner message!!";
        l.innerMethod();
    }
}

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerValue = 56;
        outer.outerMessage = "Outer message!";
        outer.outerMessage();
    }
}
