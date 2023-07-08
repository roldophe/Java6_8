package Abstraction.Shape;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red",2.25);
        System.out.println(s1);

        Shape s2 = new Rectangle("Blue",12.5,7.50);
        System.out.println(s2);
    }
}
