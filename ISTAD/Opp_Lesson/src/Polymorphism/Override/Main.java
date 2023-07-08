package Polymorphism.Override;

class Parent{
    void someMethod(){
        System.out.println("Parent Method!");
    }
    void anotherMethod(){
        System.out.println("This is another method(Parent).");
    }
}

class Child extends Parent{
    @Override
    void someMethod() {
        super.someMethod();
        System.out.println("This is child method now.");
    }

    @Override
    void anotherMethod() {
        super.anotherMethod();
        System.out.println("this is child another method.");
    }
}
public class Main {
    public static void main(String[] args) {
        Child child=new Child();
        child.someMethod();
        child.anotherMethod();
    }
}
