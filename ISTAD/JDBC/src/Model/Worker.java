package Model;

public class Worker {
    private int workerId;
    private String name;
    private String gender;
    private int age;
    private double salary;
    private String address;
    private String date;

    public Worker() {
    }

    public Worker(int workerId, String name, String gender, int age, String address, String date, double salary) {
        this.workerId = workerId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.address = address;
        this.date = date;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void showInformation() {
        System.out.println("    Worker  Id: " + workerId);
        System.out.println("    Worker  name: " + name);
        System.out.println("    Worker  gender: " + gender);
        System.out.println("    Worker  age: " + age);
        System.out.println("    Worker  date   : " + date);
        System.out.println("    Worker  salary: " + salary);
        System.out.println("    Worker  address: " + address);

        System.out.println("----------------------------------");
    }
}
