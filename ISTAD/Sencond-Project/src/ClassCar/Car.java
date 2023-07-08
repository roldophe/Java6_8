package ClassCar;

public class Car {
    int speed;
    String color;

    Car(){
        this.speed=60;
        this.color="blue";
    }
    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }
    public int getSpeed() {return speed;}
    public String getColor() {return color;}

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
