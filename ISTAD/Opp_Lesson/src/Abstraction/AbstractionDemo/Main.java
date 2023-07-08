package Abstraction.AbstractionDemo;
// 1. abstract class
// 2.  interface

//related to the inheritance
abstract class Parent{
    String message;
    abstract void method();
    void normalMethod(){
        System.out.println("I am just a normal method!");
    }
    Parent(){
        System.out.println("This is non-parameterized constructor of Parent!");
    }
    Parent(String message){
        this.message= message;
        System.out.println("This is parameterized constructor of Parent!");
    }
}
class Child extends Parent{
    @Override
    void method() {
        System.out.println("This is the method inside the child!");
    }

    @Override
    void normalMethod() {
        super.normalMethod();
        System.out.println("I have override this method now!");
    }
    Child(){}
    Child(String message){
        super(message);
    }

}
public class Main {
    public static void main(String[] args) {

        //downCasting
        Parent objParent = new Child("Tesing!");
        //abstract cannot create object
        Child child = new Child("ROLDOPHE");
        child.method();
        child.normalMethod();
        System.out.println("Message: "+child.message);

    }
}
