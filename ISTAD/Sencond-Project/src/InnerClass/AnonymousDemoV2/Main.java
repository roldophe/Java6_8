package InnerClass.AnonymousDemoV2;
//normal class, abstract class,-> interface

//interface is a blueprint of class.
// class is a blueprint for object.
// object is an instance of class.
interface IParent {
    void something();
}
class Child implements IParent {
    @Override
    public void something() {
        System.out.println("Implemented something method!");
    }
}
public class Main {
    public static void main(String[] args) {
//        Child obj = new Child();
//        obj.something();

        IParent obj = new Child(){
            @Override
            public void something() {
                System.out.println("This is the implemented method of something !");
            }

        };
        obj.something();

        IParent obj2 = ()-> System.out.println("Another version of something");
        obj2.something();
    }

    //lambda expression


}
