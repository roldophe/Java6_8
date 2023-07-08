package StreamReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;
    String gender;
    int age;
    List<Float> scores = new ArrayList<>();

    Student() {
    }

    Student(int id, String name, String gender, int age, List<Float> scores) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.scores = scores;
    }

    void output() {
        System.out.printf("ID: %d Name:%s Gender: %s Age: %d%n", id, name, gender, age);
        System.out.println("\tScores: " + scores);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", scores=" + scores +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "RADOM", "Male", 21, new ArrayList<>(Arrays.asList(78f, 56f, 45f))));
        students.add(new Student(203, "RachNa", "FeMale", 20, new ArrayList<>(Arrays.asList(70f, 86f, 65f))));
        students.add(new Student(223, "ROLDOPHE", "Male", 23, new ArrayList<>(Arrays.asList(70f, 86f, 65f))));
        students.stream().forEach(student -> student.output());
        List<Student> students1 = students.stream().filter(student1 -> student1.gender.equalsIgnoreCase("Male")).collect(Collectors.toList());
        students1.forEach(Student::output);

    }
}
