package Inheritance.Animal;

public class AnimalApplication {
    public static void main(String[] args) {
        Animal animal = new Animal();
       // animal.name = "koko";
        //animal.showName();
        Dog dog = new Dog();
        //dog.age=2;
       // dog.eat();
//        dog.showInfo();
//        dog.display();
       // dog.showName();
        dog.setName("Kitty");
        dog.eatAll();
        dog.display();

    }
}
