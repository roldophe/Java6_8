package com.Radom.java.OnlineCourse.OPP.ConstructorEmployee;

public class Employee {
    private String name;
    private String gender;
    private double salary;
    public Employee(String addrName, String addrGender, double addrSalary){
        this.name=addrName;
        this.gender=addrGender;
        this.salary=addrSalary;
    }
    public void setName(String name) {this.name = name;}
    public void setGender(String gender) {this.gender = gender;}
    public String getName() {return name;}
    public String getGender() {return gender;}
    public void setSalary(double salary) {this.salary = salary;}
    public double getSalary() {return salary;}

    public String toString(){
        return ("Name: "+name+ " Gender: "+gender+" Salary: "+salary);
    }
}
