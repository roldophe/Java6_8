package HomeWork;
import java.util.Scanner;

public class studentApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        Student student = new StudentService().createStudent(scanner);
        studentService.ShowInfo(student);
    }
}
