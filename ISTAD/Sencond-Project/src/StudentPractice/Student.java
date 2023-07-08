package StudentPractice;

import java.util.Arrays;

public class Student {
    int id;
    String name;
    String gender;
    String classRoom;
    float[] scores;

    Student() {
        scores = new float[]{};
        System.out.println("----------------Constructor without parameters is invoked!--------------");
    }

    Student(int id, String name, String gender, String classRoom, float[] scores) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.classRoom = classRoom;
        this.scores = scores;
        System.out.println("----------------Constructor with parameters is invoked!--------------");
    }

    float findAverage() {
        float sum = 0;
        for (float score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    String gradeFinder() {
        String grade;
        float average = findAverage();
        if (average >= 95 && average <= 100) grade = "A";
        else if (average >= 85) grade = "B";
        else if (average >= 75) grade = "C";
        else if (average >= 65) grade = "D";
        else if (average >= 50) grade = "E";
        else grade = "F";
        return grade;
    }

    public void getInfo() {
        System.out.println("Student ID: " + this.id);
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Gender: " + this.gender);
        System.out.println("Student ClassRoom: " + this.classRoom);
        System.out.println("Student Scores: " + Arrays.toString(scores));
        System.out.println("Student Average is: " + findAverage());
        System.out.println("Student Grade is: " + gradeFinder());
        System.out.println("-----------------------------");
    }
}
