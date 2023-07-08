package Inheritance.InheritanceThirdDemo;
//Person :  Super, Base, Parent
class Person {
    private String name;
    private String gender;
    private int age;
    private String address;
    public Person(){}
    public Person(String name, String gender, int age, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    void outputInformation() {
        System.out.println("Name : " + this.name);
        System.out.println("Gender : " + this.gender);
        System.out.println("Age : " + this.age);
        System.out.println("Address : " + this.address);
    }
}

class Employee extends Person {
    private int empId;
    private float wage;
    private float hours;
    private String position;
    public Employee(){super();}
    public Employee(int empID, String name, String gender, int age, String address, String position, float wage, float hours) {
        super(name, gender, age, address);
        this.empId = empID;
        this.position = position;
        this.wage = wage;
        this.hours = hours;
    }

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public float getWage() {
        return wage;
    }
    public void setWage(float wage) {
        this.wage = wage;
    }
    public float getHours() {
        return hours;
    }
    public void setHours(float hours) {
        this.hours = hours;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    float findSalary() {return wage * hours;}
    @Override
    void outputInformation() {
        super.outputInformation();
        System.out.println("ID : " + empId);
        System.out.println("Position : " + position);
        System.out.println("Wage : " + wage + "$/h");
        System.out.println("Hours : " + hours + "hours");
        System.out.println("Salary : " + findSalary() + "$");
    }
}
//Competitive Programming -> Algorithm
class TopEmployee extends Employee{
    float bonus=50;
    int numberOfAwards;
    TopEmployee(){}
    TopEmployee(int empID, String name, String gender, int age, String address, String position, float wage, float hours,float bonus,int numberOfAwards){
        super(empID,name,gender,age,address,position,wage,hours);
        this.bonus=bonus;
        this.numberOfAwards=numberOfAwards;
    }
    public float getBonus() {
        return bonus;
    }
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    public int getNumberOfAwards() {
        return numberOfAwards;
    }
    public void setNumberOfAwards(int numberOfAwards) {
        this.numberOfAwards = numberOfAwards;
    }

    @Override
    void outputInformation() {
        super.outputInformation();
        System.out.println("Bonus: "+this.bonus);
        System.out.println("Number of Award: "+this.numberOfAwards);
        System.out.println("Total salary: "+(findSalary()+findSalary()/2)+"$");
    }
}
public class Main {
    public static void main(String[] args) {
        Employee obj1 = new Employee(1001, "Mr.James", "Male", 23, "Kompong Spue", "CO", 45, 90);

        System.out.println("---------------------------");
        obj1.outputInformation();
        System.out.println("---------------------------");

        TopEmployee obj2 = new TopEmployee(1002,"Mr.Roldophe","Male", 23, "Kompong Spue", "IT Manager",45,90,50,5);
        System.out.println("---------------------------");
        obj2.outputInformation();
        System.out.println("---------------------------");
    }
}
