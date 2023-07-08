package MethodDemo.Practice;

public class Employee {
    public int id;
    String name;
    String gender;
    String position;
    float wage;
    float hours;
    public float findSalary(){
        return wage*hours;
    }
}
