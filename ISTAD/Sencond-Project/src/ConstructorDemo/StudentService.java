package ConstructorDemo;

import java.util.Scanner;

public class StudentService {
    Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter student's id : ");
        student.studentID = scanner.nextInt();
        System.out.println("Enter student's Name: ");
        student.studentName = scanner.nextLine();
        System.out.println("Enter student's gender: ");
        student.gender = scanner.next();
        System.out.println("Enter student's class room: ");
        student.classRoom = scanner.nextLine();
        System.out.println("Enter student's score: ");
        student.scores = scanner.nextFloat();
        return student;
    }

    void print(Student student) {
        System.out.println("Student ID: " + student.studentID);
        System.out.println("Student name: " + student.studentName);
        System.out.println("Student gender: " + student.gender);
        System.out.println("Student class room:  " + student.classRoom);
        System.out.println("Student score:  " + student.scores);
        System.out.println("        Grade: " + gradeFinder1(student));
    }

    String gradeFinder(Student student) {
        String grade;
        if (student.scores > 95 && student.scores <= 100) grade = "A";
        else if (student.scores > 85) grade = "B";
        else if (student.scores > 75) grade = "C";
        else if (student.scores > 65) grade = "D";
        else if (student.scores > 50) grade = "E";
        else grade = "F";
        return grade;
    }

    String gradeFinder1(Student student) {
        return (student.scores >= 95 && student.scores <= 100) ? "A" :
                (student.scores >= 85) ? "B" :
                        (student.scores >= 75) ? "C" :
                                (student.scores >= 65) ? "D" :
                                        (student.scores >= 50) ? "E" : "F";
    }

}
