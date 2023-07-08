package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programmer {
    private int id;
    private String name;
    private String gender;
    private int age;
    private List<String> skills = new ArrayList<>();
    private float salary;
    public Programmer() {
    }
    public Programmer(int id, String name, String gender, int age, List<String> position, float salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.skills = position;
        this.salary = salary;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSkills(List<String> position) {
        this.skills = position;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public List<String> getSkills() {
        return skills;
    }
    public float getSalary() {
        return salary;
    }
    public Programmer insertInformation(Scanner scanner, List<Programmer> allProgrammers) throws Exception {
        id = Service.getInteger(scanner, "Please input id: ", allProgrammers);
        scanner.nextLine();
        name = Service.getString(scanner, "Please input name: ");
        gender = Service.getString(scanner, "Please input gender: ");
        age = Service.getInteger(scanner, "PLease input age: ", null);
        int number = Service.getInteger(scanner, "PLease input number of skills: ", null);
        scanner.nextLine();
        for (int i = 0; i < number; i++) {
            skills.add(i, Service.getString(scanner, "Position[" + (i + 1) + "]:"));
        }
        salary = Service.getFloat(scanner, "Please input salary: ");
        return this;
    }
    public Programmer updateInformation(Scanner scanner, List<Programmer> allProgrammers) throws Exception {
        scanner.nextLine();
        name = Service.getString(scanner, "Please input name: ");
        gender = Service.getString(scanner, "Please input gender: ");
        age = Service.getInteger(scanner, "PLease input age: ", null);
        int number = Service.getInteger(scanner, "PLease input number of skills: ", null);
        scanner.nextLine();
        for (int i = 0; i < number; i++) {
            skills.set(i, Service.getString(scanner, "Position[" + (i + 1) + "]:"));
        }
        salary = Service.getFloat(scanner, "Please input salary: ");
        return this;
    }
    public void showInformation() {
        System.out.println("    ID: %d     Name: %s   Gender: %s    Age: %d".formatted(id, name, gender, age));
        System.out.println("    Skills: " + skills);
        System.out.println("    Salary: " + salary);
        System.out.println("----------------------------------------------------------");
    }
}
