package ArrayList.Univversity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student implements IFeature {
    Scanner scanner = new Scanner(System.in);
    private int id;
    private String name;
    private String gender;
    private int age;
    private List<Float> scores = new ArrayList<>();

    public Student() {
    }

    public Student(int id, String name, String gender, int age, List<Float> scores) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.scores = scores;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    float findAverage() {
        float sum = 0;
        for (Float score : scores) {
            sum += score;
        }
        return sum / scores.size();
    }

    String gradeFinder() {
        float grade=findAverage();
        return grade >= 95 ? "A" : grade >= 85 ? "B" : grade >= 75 ? "C" : grade >= 50 ? "D" : "F";
    }

    public Student insert() {
        id = InputUtils.getInt(scanner, "Please Input Id: ");
        name = InputUtils.getStringLn(scanner, "Please Input Name: ");
        scanner.nextLine();
        gender = InputUtils.getStringLn(scanner, "Please Input Gender: ");
        age = InputUtils.getInt(scanner, "Please Input Age: ");
        int number = InputUtils.getInt(scanner, "Please Input Number of Score: ");
        for (int i = 0; i < number; i++) {
            scores.add(InputUtils.getFloat(scanner, "\t\tScore[" + (i + 1) + "]:"));
        }
        return this;
    }

    public void display() {
        System.out.printf("ID: %d Name: %s Gender: %s Age:%d%n", id, name, gender, age);
        System.out.println("Scores: " + scores);
        System.out.printf("Average:%.2f \tGrade[%s] \n", findAverage(), gradeFinder());

    }

    public Student update() {
        name = InputUtils.getStringLn(scanner, "Please Input Name: ");
        gender = InputUtils.getStringLn(scanner, "Please Input Gender: ");
        age = InputUtils.getInt(scanner, "Please Input Age: ");
        int number = InputUtils.getInt(scanner, "Please Input Number of Score: ");
        for (int i = 0; i < number; i++) {
            scores.add(InputUtils.getFloat(scanner, "\t\tScore[" + (i + 1) + "]:"));
        }
        return this;
    }
}
