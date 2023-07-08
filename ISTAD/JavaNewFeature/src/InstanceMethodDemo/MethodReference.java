package InstanceMethodDemo;

interface MessageAble {
    void saySomething(String value, int age);

    default void anotherOne() {
        System.out.println("I am another method form message able interface.");
    }
}

class NormalClass {
    String value;
    int age;

    NormalClass() {
        System.out.println("This is constructor without parameters.");
    }

    NormalClass(String value, int age) {
        this.value = value;
        this.age = age;
        System.out.println("Value is: " + value);
        System.out.println("Age is: " + age);
    }

}

public class MethodReference {
    public static void main(String[] args) {
        MessageAble objMessage = NormalClass::new;
        objMessage.saySomething("Letter for the kings!!", 23);
    }
}
