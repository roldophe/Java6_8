package Inheritance.Person;

public class Teacher extends Person{
    private double salary;
    private String nationality="Thai";
    final int HOUR =100; //must be initialized and can not override.
    public Teacher(){
        super("Thida","female",30);
        this.salary=100;
    }
//
//    @Override
//    public void showInfo() {// we cannot override if method in superClas is final
//        super.showInfo();
//    }

    String disNationality(){
        //return nationality;//return from subClass
        return super.nationality;//return from superClass
    }
    @Override
    public String toString() {//should be used this
        return super.toString()+"\tSalary: "+salary;
    }
//
//    @Override
//    public String toString() {
//        return "Teacher{" +
//                "salary=" + salary +
//                ", name='" + name + '\'' +
//                ", gender='" + gender + '\'' +
//                ", age=" + age +
//                '}';
//    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
