package ClassCar;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car(50, "red");
        Car ferrari = new Car(60, "green");
        System.out.println("TOYOTA: ");
        System.out.println("Speed: " + toyota.speed);
        System.out.println("Color: " + toyota.color);
        System.out.println("FERRARI:");
        System.out.println("Speed: " + ferrari.speed);
        System.out.println("Color: " + ferrari.color);

        System.out.println("BigCar:");

        Car car = new Car();
        System.out.println(car.toString());
        BigCar bigCar = new BigCar();
    }
}
