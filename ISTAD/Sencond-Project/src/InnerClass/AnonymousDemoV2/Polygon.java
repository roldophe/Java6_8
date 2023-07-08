package InnerClass.AnonymousDemoV2;

public class Polygon {//Outer class
    public void display() { //Outer method
        System.out.println("Inside the polygon class.");
    }

    class AnonymousDemo { //Inner class
        //crate anonymous by extending class polygon
        public void createClass() { //Inner method
            Polygon p1 = new Polygon() {
                @Override
                public void display() {
                    System.out.println("Inside an anonymous class.");
                }
            };
            p1.display();
        }
    }

    public static void main(String[] args) {
        Polygon polygon = new Polygon();
        polygon.display();
        AnonymousDemo anonymousDemo = polygon.new AnonymousDemo();
        anonymousDemo.createClass();
    }
}
