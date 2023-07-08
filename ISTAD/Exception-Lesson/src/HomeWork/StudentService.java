package HomeWork;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentService {
    public Student createStudent(Scanner scanner) {
        int id = Service.getInteger(scanner, "Please input id: ");
        String name = Service.getStringLn(scanner, "Please input name: ");
        String gender = Service.getStringLn(scanner, "Please input male: ");
        int age = Service.getInteger(scanner, "Please input age: ");
        int number = Service.getInteger(scanner, "Please input number of subject: ");
        Set<String> subjects = new HashSet<>();
        for (int i = 0; i < number; i++) {
            subjects.add(Service.getStringLn(scanner, "\t\tSubject[" + (i + 1) + "]:"));
        }
        return new Student(id, name, gender, age, subjects);
    }

    public void ShowInfo(Student student) {
        System.out.println("------------------------------------------");
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student name: " + student.getName());
        System.out.println("Student gender: " + student.getGender());
        System.out.println("Student age: " + student.getAge());
        System.out.println("Student Subject: " + student.getSubjects());
        System.out.println("------------------------------------------");
    }
}
