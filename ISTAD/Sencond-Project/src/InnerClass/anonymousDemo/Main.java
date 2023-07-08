package InnerClass.anonymousDemo;

//Inheritance
class Parents {
    void something() {
        System.out.println("This is something.");
    }
}

class Child extends Parents {
    @Override
    void something() {
        super.something();
        System.out.println("Overridden something method!!");
    }
}

public class Main {
    public static void main(String[] args) {
//        Child child = new Child();
//        child.something();


        //anonymous class doesn't have a name
        //this call anonymous class.
        Parents obj = new Parents() {
            @Override
            void something() {
                System.out.println("New version of something method!!");
            }
        };
        obj.something();


    }
}
