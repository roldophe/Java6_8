package InnerClass.AnonymousDemoV2;
interface IPolygonV2{
    public void display();
}
class AnonymousDemo{
    //anonymous implementing an interface
    public void createClass(){
        IPolygonV2 p1 = new IPolygonV2() {
            @Override
            public void display() {
                System.out.println("Here is the inside of anonymous Class.");
            }
        };
        p1.display();
    }
}
public class PolygonV2 {
    public static void main(String[] args) {
        IPolygonV2 obj = new IPolygonV2() {
            @Override
            public void display() {
                System.out.println("Here is the inside of Polygon Class.");
            }
        };
        obj.display();
        AnonymousDemo anonymousDemo = new AnonymousDemo();
        anonymousDemo.createClass();
    }
}
