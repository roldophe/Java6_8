package Encapsulation.EncapsulationDemo;
class Animal {
    private String bread;
    private int numberOfLeg;
    private String type;

    public Animal(String bread, int numberOfLeg, String type) {
        this.bread = bread;
        this.numberOfLeg = numberOfLeg;
        this.type = type;
    }

    //getter and setter
    //getter: provides ability to read the properties of obj
    //setter : provides ability to write/ set....
    public String getBread() {return bread;}
    public void setBread(String bread) {this.bread = bread;}
    public int getNumberOfLeg() {return numberOfLeg;}
    public void setNumberOfLeg(int numberOfLeg) {
            if (numberOfLeg == 4)
                this.numberOfLeg = numberOfLeg;
            else
                System.out.println("Number of legs not greater than 4.");
    }
    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
    private void eat(String food) {
        System.out.println("Dog eating dog's food.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "bread='" + bread + '\'' +
                ", numberOfLeg=" + numberOfLeg +
                ", type='" + type + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Europe",4,"Mammal");
        System.out.println(animal);
        animal.setBread("Asia");
        animal.setNumberOfLeg(4);
        System.out.println(animal);
    }
}
