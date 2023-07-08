package Interface.PracticeInterface;

import java.util.Scanner;

public class Worker implements ClientFeatures{

    private int workerID;
    private String name;
    private float salary;

    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    Worker(){}
    public Worker(int workerID, String name, float salary) {
        this.workerID = workerID;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public Worker addRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id: ");
        workerID = scanner.nextInt();
        System.out.print("Enter name: ");scanner.nextLine();
        name = scanner.nextLine();
        System.out.print("Enter salary: ");
        salary = scanner.nextFloat();
        return this;
    }

    @Override
    public Worker updateRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");scanner.nextLine();
        name = scanner.nextLine();
        System.out.print("Enter salary: ");
        salary = scanner.nextFloat();
        return this;
    }

    @Override
    public void ShowRecord() {
        System.out.println("Worker ID: "+workerID);
        System.out.println("Worker Name: "+name);
        System.out.println("Worker Salary: "+salary);
        System.out.println("--------------------------");
    }

    @Override
    public String getObjectType() {
        return this.getClass().getSimpleName();
    }
}
