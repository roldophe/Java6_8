package Abstraction.Shape;

abstract class Shape {
        private  String color;

        //these are abstract methods
    abstract double area();
    public abstract String toString();

    //abstract class can have the constructor
    public Shape(String color){
        System.out.println("Shape constructor called.");
        this.color=color;
    }
    //this is a concrete method
    public String getColor(){
        return this.color;
    }
}
class Circle extends Shape{
    double radius;
    public Circle(String color,double radius){
        //Calling Shape constructor
        super(color);
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2); //PI*radius*radius
    }

    @Override
    public String toString() {
        return "Circle color is: "+super.getColor()+
                " and area is:%.2f ".formatted(area());
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(String color, double length, double width){
        //Calling Shape constructor
        super(color);
        this.length=length;
        this.width = width;
    }

    @Override
    double area() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle color is: "+super.getColor()+
                " and area is : "+area();
    }
}


