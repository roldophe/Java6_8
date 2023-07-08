package Aceessibility;

public class Person {
    //instance variable
   private int id;
   private String name;
   private String gender;
   private int age;

    //    1. default constructor: provided by javac(java compiler)
    //    2. no params constructor:
    //accessibility (default, public , private) classname(){}
    Person() {
        this("jame");
        this.gender = "male";
        System.out.println("I am constructor without parameters");
    }

    Person(String name) {
        //this refers the current object
        this.test();
        System.out.println("I am a constructor with params");
        this.name = name;
    }

    Person(String name, String gender, int age){
        System.out.println("Three constructors!!");
        this.name=name;
        this.gender= gender;
        this.age= age;
    }
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + ", gender='" + gender + '\'' + ", age=" + age + '}';
    }

    void test (){
        System.out.println("I am a test method");
    }
    void message(){
        this.test();
        System.out.println("I am method in inside Person class!");
    }


}
