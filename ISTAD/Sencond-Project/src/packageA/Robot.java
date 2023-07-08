package packageA;

public class Robot {
    protected int serialNumber;
    protected String model;
    protected String chipSet;
    protected void wald(){
        System.out.println("this robot is walking.");
    }

    @Override
    public String toString() {
        return "Robot{" +
                "serialNumber=" + serialNumber +
                ", model='" + model + '\'' +
                ", chipSet='" + chipSet + '\'' +
                '}';
    }
}
