package ClassStudent;

import java.util.Scanner;

public class StudentService {
    Student input() {
        int id = getInteger("Please input id: ");
        String name = getStringLn("Please input name: ");
        String gender = getString("Please input gender: ");
        String classRoom = getString("Please input class room: ");
        int number = getInteger("Please input number of scores: ");
        float[] scores = new float[number];
        System.out.println("Enter scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = getFloat("score[" + (i + 1) + "]:");
        }
        return new Student(id, name, gender, classRoom, scores);
    }
    public Student[] inputAll(int number) {
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
            students[i].output();
        }
    }
    public Student maxScore(Student[] students) {
        Student max = students[0];
        for (Student student : students)
            if (max.findAverage() < student.findAverage())
                max = student;
        return max;
    }
    public void searchByName(Student[] students) {
        boolean search = false;
        String s_name = getStringLn("Input name for search: ");
        for (Student student : students) {
            //if (Objects.equals(s_name, student.name))
            if(s_name.equalsIgnoreCase(student.name)){
                search = true;
                student.output();
                break;
            }
        }
        if (!search) System.out.println("Search not found!");
    }
    public void searchByID(Student[] students) {
        boolean search = false;
        int s_id = getInteger("id name for search: ");
        for (Student student : students) {
            if (student.id == s_id) {
                search = true;
                student.output();
                break;
            }
        }
        if (!search) System.out.println("Search not found!");
    }
    public static String getString(String label) {
        System.out.print(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public static String getStringLn(String label) {
        System.out.print(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static int getInteger(String label) {
        String text = getString(label);
        return Integer.parseInt(text);
    }
    public static float getFloat(String label) {
        String text = getString(label);
        return Float.parseFloat(text);
    }
}
