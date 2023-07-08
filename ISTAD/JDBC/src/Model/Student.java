package Model;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String gender;
    private int age;
    private String Classroom;
    private double average;

    public Student() {
    }

    public Student(int id, String name, String gender, int age, String classroom, double average) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        Classroom = classroom;
        this.average = average;
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

    public String getClassroom() {
        return Classroom;
    }

    public double getAverage() {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(average));
    }
    public Student inputStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        scanner.nextLine();
        name = scanner.nextLine();
        System.out.print("Enter student age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter student gender: ");
        gender = scanner.nextLine();
        System.out.print("Enter student classroom:");
        Classroom = scanner.nextLine();
        System.out.print("Enter student average: ");
        average = scanner.nextFloat();
        return this;
    }

}
