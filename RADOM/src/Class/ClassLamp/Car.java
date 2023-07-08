package Class.ClassLamp;

public class Car {
    String color;
    int numberOfWheel;
    double price;

    void drive() {
        isDriving=true;
    }
    boolean isDriving;
    void info() {
        System.out.println("v1: Color: " + color + " Number of wheel: " + numberOfWheel + " Price: " + price);
    }

    void info2(){
        System.out.printf("v2: Color: %s Number of wheel : %d Price: %f%n", color,numberOfWheel,price);
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Red";
        car.price = 20000;
        car.numberOfWheel = 4;
        System.out.println(car.color);
        System.out.println(car.numberOfWheel);
        System.out.println(car.price);

        car.info();
        car.info2();
        System.out.println(car.isDriving);
        car.drive();
        System.out.println(car.isDriving);
    }

}
