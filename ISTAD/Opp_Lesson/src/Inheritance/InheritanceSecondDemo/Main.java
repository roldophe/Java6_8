package Inheritance.InheritanceSecondDemo;

import java.util.Arrays;

class Person {// Create a person class

    String name;
    String gender;
    int age;

    Person() {
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    void ShowInformation() {
        System.out.println("______________________________");
        System.out.println("Name is: " + name);
        System.out.println("Gender is: " + gender);
        System.out.println("Age is: " + age);
        System.out.println("-------------------------------");
    }
}

class Student extends Person {
    int studentId;
    String classroom;
    float[] scores;

    float findAverage() {
        float sum = 0;
        for (float score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    void printInformation() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Classroom: " + classroom);
        System.out.println("Scores: " + Arrays.toString(scores));
        System.out.println("Average: " + findAverage());
    }

}

public class Main {
    public static void main(String[] args) {

        Person person = new Person("RADOM", "male", 21);
        Student student = new Student();
        student.studentId = 101;
        student.classroom = "M7";
        student.scores = new float[]{95, 78, 95, 55, 68};
        person.ShowInformation();
        student.printInformation();

    }
}
