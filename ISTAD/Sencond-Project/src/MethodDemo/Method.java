package MethodDemo;

public class Method {
    //returnType methodName(params){}

    //method signature
    static void sayHello() { //no returnType no params
        //method definition
        System.out.println("say hello!");

    }

    //no returnType has params
    static void sayMessage(String text) {
        for (int i = 0; i < 3; i++)
            System.out.println(text);
    }

    static String getFullName() {
        String first = "james";
        String last = "Camaroon";
        System.out.println("You called getFullName().");
        return first + " " + last;
    }

    static String getFullName(String first, String last) {
        System.out.println("You called getFullName().");
        return first + " " + last;
    }

    public static void main(String[] args) {
        //user-defined method
        //I. has return type
        // 1. a has return-type, no params
        // 1. b has return-type, has params
        //II. no return type
        // 2.  has no return-type, no params
        // 2.  has no return-type, has params

        sayHello();
        System.out.println("----No params----");
        sayHello();

        System.out.println("----has params----");
        sayMessage("i love you!!");
        System.out.println("---------has returnType--------");
        String fullName = getFullName();
        System.out.println("Full name is: " + fullName);
        System.out.println("---------has returnType and params--------");
        System.out.println("Full name is: " + getFullName("RADOM","KHOEM"));
    }
}