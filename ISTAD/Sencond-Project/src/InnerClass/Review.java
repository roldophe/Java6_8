package InnerClass;

//normal class vs interface
class Parent {
    void show() {
        System.out.println("This is show function(parent).");
    }
}

// normal approach
class Child extends Parent {
    @Override
    void show() {
        System.out.println("This is show function (Child).");
    }
}


//interface -> fully abstract class
//interface is blueprint for class.
//class is a blueprint for object.
// object is an instance of class.

//Normal interface
//interface IFeature{
//    //abstract method
//    //method that doesn't have definition
//    //method has only signature
//
//    void onClick();
//    void onPress();
//}

//functional interface

@FunctionalInterface
interface IFeature {
    void OnClick();
}
interface Drive{
    void IsDriving();
}

public class Review {
    public static void main(String[] args) {
//        Parent obj = new Parent(){
//            @Override
//            void show() {
//                System.out.println("Show message has been update");
//            }
//        };
//        obj.show();
        //normal interface

        /**       IFeature obj  = new IFeature() {
        @Override public void onClick() {
        System.out.println("OnClick is triggered!");
        }

        @Override public void onPress() {
        System.out.println("OnPress is triggered!");
        }
        };
         obj.onClick();
         obj.onPress();*/
        IFeature obj = () -> System.out.println("OnClick is triggered!");
        obj.OnClick();
        Drive obj1 = () -> System.out.println("Car is driving.");
        obj1.IsDriving();

    }

}
