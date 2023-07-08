package ClassCar;

public class BigCar extends Car{
    public BigCar(int speed, String color) {
        super(speed, color);
    }
    public BigCar(){
        //super();
        System.out.println("I am in inside class Big car.");
    }
}
