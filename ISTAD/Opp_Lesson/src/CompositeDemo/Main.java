package CompositeDemo;
//is-a-relationship->inheritance
class Tesla{
    String plateNumber;
    String color;
    String model;
    Engine engine;//composite
    Tesla(){
        this.engine = new Engine();
    }
    Tesla(String plateNumber, String color, String model,Engine engine){
        this.plateNumber=plateNumber;
        this.color=color;
        this.model=model;
        this.engine = engine;
    }
    void ShowTeslaInformation(){
        System.out.println("---------------------------------------");
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("PlateNumber: "+plateNumber);
        engine.printEngineInfo();
        System.out.println("---------------------------------------");
    }

}//tightly vs loosely
class Engine{

    int enginePower;
    String engineModel;
    int year;
    String modeBy;
    Engine(){
        //provide reference
        Engine engine= new Engine();
    }
    Engine(int enginePower, String engineModel, int year, String modeBy){
        this.enginePower=enginePower;
        this.engineModel=engineModel;
        this.year=year;
        this.modeBy=modeBy;
    }
    void printEngineInfo(){
        System.out.println("***********************************");
        System.out.println("Engine Model: "+engineModel);
        System.out.println("Engine Power: "+enginePower);
        System.out.println("Make in: "+year);
        System.out.println("manufactured By: "+modeBy);
        System.out.println("***********************************");
    }
}
//user for outer
public class Main {
    public static void main(String[] args) {
        Tesla tesla = new Tesla("PP-1771","Blue","FileZilla-2023",new Engine(500,"Nginx",2023,"Cambodia"));
        tesla.ShowTeslaInformation();
    }
}
