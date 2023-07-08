package InnerClass.StaticDemo;

public class Animal {//Outer class

    //inner class
    class Reptile {

        public void displayInfo() {
            System.out.println("I am a reptile.");
        }
    }

    //static class
    static class Mammal {
        public void displayInfo() {
            System.out.println("I am a mammal.");
        }
    }

}
class MainV2{
    //Main class for display information
    public static void main(String[] args) {
        //object creation of the outer class
        Animal animal = new Animal();

        //object creation of the non-static class
        Animal.Reptile obj1 = animal.new Reptile();
        obj1.displayInfo();

        //object creation of the static nested class
        Animal.Mammal obj2 = new Animal.Mammal();
        obj2.displayInfo();

    }
}
