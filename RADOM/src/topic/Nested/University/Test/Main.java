package topic.Nested.University.Test;


abstract class Person{ //abstract class cannot create objects
    public abstract void display();
}
class Student extends Person{

    @Override
    public void display() {
        System.out.println("Overridden from class Person!");
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Student();// abstract class can create object of subclass.
        person.display();

        Person person1 = new Person() {
            @Override
            public void display() {
                System.out.println("Used anonymous inner class to create object abstract class.");
            }
        };
        person1.display();
    }
}
