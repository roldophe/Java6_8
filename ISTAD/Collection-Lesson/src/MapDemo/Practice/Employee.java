package MapDemo.Practice;

public class Employee {
    int id;
    String name;
    String gender;
    float salary;

    public Employee(){}
    public Employee(int id, String name, String gender, float salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
