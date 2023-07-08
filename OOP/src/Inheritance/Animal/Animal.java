package Inheritance.Animal;

public class Animal /*extends objects*/ {
    protected String name;
    protected int age;

    protected void eat() {
        System.out.println("Animal can eat.");
    }
    void showName() {
        System.out.println("Animal name is: " + name);
    }



}
