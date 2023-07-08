package Class.ClassLamp;

public class Lamp {
    //stores the value for light
    //true if light is on
    //false if light is off
    boolean isOn;
    //method to turn on the light
    void turnOn(){
        isOn=true;
        System.out.println("light on? "+isOn);
    }
    //mothod to turn off the light
    void turnOff(){
        isOn=false;
        System.out.println("light off? "+isOn);
    }

    public static void main(String[] args) {
        //create an object of lamp
        Lamp led = new Lamp();
        // access method using object
        led.turnOff();
    }
}
