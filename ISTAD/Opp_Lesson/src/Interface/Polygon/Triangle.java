package Interface.Polygon;

public class Triangle implements Polygon {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b,double c){
        this.a =a;
        this.b=b;
        this.c=c;
    }
    @Override
    public double getArea() {
        //double p = (a+b+c)/2;
        double p=getPerimeter()/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    @Override
    public double getPerimeter() {
        return (a+b+c);
    }
    @Override
    public String toString() {
        return "Triangle[" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", Area:%.2f ".formatted(getArea())+
                ", Perimeter: "+getPerimeter()+
                ']';
    }

}
