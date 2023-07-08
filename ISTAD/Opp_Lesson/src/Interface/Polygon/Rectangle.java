package Interface.Polygon;

public class Rectangle implements Polygon{
    private double width;
    private double height;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "width=" + width +
                ", height=" + height +
                ", area= "+ getArea()+
                ", Perimeter: "+getPerimeter()+
                ']';
    }

    @Override
    public double getPerimeter() {
        return (width+height)*2;
    }
}
