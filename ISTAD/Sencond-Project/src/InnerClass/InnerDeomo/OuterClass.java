package InnerClass.InnerDeomo;

public class OuterClass {
    public static class StaticNestedClass{
        String username ="mr.roldophe";
        String gender = "male";
        void display(){
            System.out.println("Username: "+username+" Gender: "+gender);
        }
    }

    public static void main(String[] args){
        OuterClass.StaticNestedClass nestedClass = new OuterClass.StaticNestedClass();
        nestedClass.display();

        nestedClass.username="RADOM";
        nestedClass.gender="male";
        nestedClass.display();
    }

}
