package CompetionPractice;

//inheritance: is a relationship
//composite: has a relationship

//car-> electricity
//car->gasoline
//car->gas...

//Class Car: Parent class
//Tesla
//Toyota
class Car {
    String plateNumber;
    String color;
    String model;
    Engine engine;

    Car() {
        engine = new Engine();
    }

    Car(String plateNumber, String color, String model, Engine engine) {
        this.plateNumber = plateNumber;
        this.color = color;
        this.model = model;
        this.engine = engine;
    }

    void showCarInformation() {
        System.out.println("******************************************");
        System.out.println("Car Model: " + model);
        System.out.println("Car Plate Number: " + plateNumber);
        System.out.println("Car Color: " + color);
        engine.printEnginInformation();
        System.out.println("******************************************");
    }
}
class SmartMonitor{
    String chipSetModel;
    int numberCPU;
    int refreshRates;
    int ram;
    SmartMonitor(){}
    SmartMonitor(String chipSetModel, int numberCPU,int refreshRates, int ram){
        this.chipSetModel=chipSetModel;
        this.numberCPU=numberCPU;
        this.refreshRates=refreshRates;
        this.ram=ram;
    }
    void showMonitorInformation(){
        System.out.println("===========================");
        System.out.println("ChipSet Model: " +chipSetModel);
        System.out.println("Refresh Rates: " +refreshRates);
        System.out.println("Ram: " +ram +"GB");
        System.out.println("Number of CPU: " +numberCPU);
        System.out.println("===========================");
    }
}
class TraditionalRadio{
    int numberOfChanel;
    String model;
    TraditionalRadio (){}
    TraditionalRadio(int numberOfChanel, String model){
        this.numberOfChanel=numberOfChanel;
        this.model=model;
    }
    void showRadioInformation(){
        System.out.println("************************");
        System.out.println("Number of Chanel: "+numberOfChanel);
        System.out.println("Radio Model: "+model);
        System.out.println("************************");
    }
}
class Tesla extends Car {
    SmartMonitor smartMonitor;
    Tesla(){
        smartMonitor = new SmartMonitor();
    }
    Tesla(String plateNumber, String color, String model, Engine engine,SmartMonitor smartMonitor){
        super(plateNumber, color, model, engine);
        this.smartMonitor=smartMonitor;
    }

    @Override
    void showCarInformation() {
        System.out.println("************************");
        super.showCarInformation();
        smartMonitor.showMonitorInformation();
        System.out.println("************************");
    }
}
class Toyota extends Car {
    TraditionalRadio radio;
    Toyota(){
        radio =new TraditionalRadio();
    }
    Toyota(String plateNumber, String color, String model, Engine engine,TraditionalRadio radio){
        super(plateNumber, color, model, engine);
        this.radio=radio;
    }
    void showCarInformation(){
        System.out.println("************************");
        super.showCarInformation();
        radio.showRadioInformation();
        System.out.println("************************");
    }
}
class Engine {
    String engineModel;
    String engineType;
    String madeBy;
    int enginePower;
    int madeInYear;

    Engine() {
    }

    Engine(String engineModel, String engineType, String madeBy, int enginePower, int madeInYear) {
        this.engineModel = engineModel;
        this.engineType = engineType;
        this.madeBy = madeBy;
        this.enginePower = enginePower;
        this.madeInYear = madeInYear;
    }

    void printEnginInformation() {
        System.out.println("***************************************");
        System.out.println("Engine Model: " + engineModel);
        System.out.println("Engine Type:" + engineType);
        System.out.println("Engine Made By:" + madeBy);
        System.out.println("Engine Power:" + enginePower);
        System.out.println("Engine Made In Year:" + madeInYear);
        System.out.println("***************************************");
    }
}

public class Main {
    public static void main(String[] args) {
        //Create two object which are the children of class for
        Engine teslaEngine = new Engine("Nginx","United State","Electricity",2022,500);
        SmartMonitor teslaSmartMonitor = new SmartMonitor("IntelChipSet-2023",3,244,32);
        Tesla tesla = new Tesla("Teizillax-2023","Black","PP-1771",teslaEngine,teslaSmartMonitor);
        tesla.showCarInformation();

        //create object of Toyota using anonymous objects
        Engine toyotaEngine =  new Engine("Nginx","United State","Electricity",2022,500);
        TraditionalRadio radio = new TraditionalRadio(1771,"Nisann");
        Toyota toyota = new Toyota("PP-8212","Red","Tacoma",toyotaEngine,radio);
        toyota.showCarInformation();
    }
}
