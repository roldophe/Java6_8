package StudentPractice;

import java.util.Objects;
import java.util.Scanner;
public class StudentService {
    Student input() {
        Scanner scanner = new Scanner(System.in);
        int id = Utils.getInteger("Enter ID: ");
        String name = Utils.getStringLn("Enter name: ");
        String gender = Utils.getString("Enter gender: ");
        String classRoom = Utils.getString("Enter class room:");
        int number = Utils.getInteger("Enter number of subject: ");
        float[] scores = new float[number];
        System.out.println("Enter scores: ");
        {
            for (int i = 0; i < scores.length; i++) {
                System.out.print("Score[" + (i + 1) + "]:");
                scores[i] = scanner.nextFloat();
            }
        }
        //Student student = new Student(id, name, gender, classRoom, scores);
        return new Student(id, name, gender, classRoom, scores);
    }

    public Student[] inputAllData(int number) {
        Student[] students = new Student[number];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student[" + (i + 1) + "]:");
            students[i] = input();
        }
        return students;
    }

    public void outputAll(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student[" + (i + 1) + "]:");
            students[i].getInfo();
        }
    }

    public void output(Student student) {
        student.getInfo();
    }

    public Student maxScore(Student[] students) {
        Student max = students[0];
        for (Student student : students) {
            if (max.findAverage() < student.findAverage()) {
                max = student;
            }
        }
        return max;
    }
    public void searchByName(Student[] students) {
        boolean isFalse = false;
        String s_name = Utils.getStringLn("Please input name for search: ");
        for (int i = 0; i < students.length; i++) {
            if (Objects.equals(students[i].name, s_name)) {
                System.out.println("Student[" + (i + 1) + "]:");
                isFalse = true;
                students[i].getInfo();
                break;
            }
        }
        if (!isFalse) System.out.println("Search name not found!");
    }
    public void searchByFirst(Student[] students) {
        boolean isFalse = false;
        String s_name = Utils.getStringLn("Please input name for search: ");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student[" + (i + 1) + "]:");
            if (!Objects.equals((students[i].name.split(" ")), s_name)) {
                continue;
            }
            students[i].getInfo();
            isFalse = true;
            break;

        }
        if (!isFalse)
            System.out.println("Search name not found!");
    }


    public void searchById(Student[] students) {
        boolean isFalse = false;
        int s_id = Utils.getInteger("Enter id for search:");
        for (int i = 0; i < students.length; i++) {
            if (s_id == students[i].id) {
                System.out.println("Student[" + (i + 1) + "]:");
                students[i].getInfo();
                isFalse = true;
                break;
            }
        }
        if (!isFalse) System.out.println("Search not found!");
    }
}
