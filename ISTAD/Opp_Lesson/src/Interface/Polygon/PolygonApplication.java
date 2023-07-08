package Interface.Polygon;

public class PolygonApplication {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12,15);
        System.out.println(rectangle);
        //System.out.println(rectangle.getPerimeter());

        Triangle triangle= new Triangle(3,5,7);
        System.out.println(triangle);
        //System.out.println(triangle.getPerimeter());
    }
}
