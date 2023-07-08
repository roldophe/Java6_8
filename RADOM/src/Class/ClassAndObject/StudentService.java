package Class.ClassAndObject;
import java.util.Scanner;
public class StudentService {
    public Student createStudent() {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Enter name: ");
        student.setName(scanner.next());

        System.out.print("Enter gender: ");
        student.setGender(scanner.next());

        System.out.print("Enter Age: ");
        student.setAge(scanner.nextInt());
        return student;
    }
    public Student[] createStudents(int numberOfStudent) {
        Student[] students = new Student[numberOfStudent];
        for (int i = 0; i < students.length; i++) {
            students[i] = createStudent();
        }
        return students;
    }
    public void print(Student[] students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
    public void sortByName(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getName().compareTo(students[j].getName()) > 0) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
    public void sortByAge(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getAge() > students[j].getAge()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
    public Student getOldestAge(Student[] students) {
        Student maxAgeStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (maxAgeStudent.getAge() < students[i].getAge()) {
                maxAgeStudent = students[i];
            }
        }
        return maxAgeStudent;
    }
}
