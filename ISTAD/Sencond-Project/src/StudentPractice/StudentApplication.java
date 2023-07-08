package StudentPractice;

import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
//        Student student = new Student(1001,"RADOM KHOEM","male","Java",new float[]{50,79,45,80,30});
//        student.output();
        //1. input number of student
        //2. show student information
        //3. Find max highest score
        //4. Search
        // -- search by id
        // -- search by name (last and fullName);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of student: ");
        int number = scanner.nextInt();
        StudentService studentService = new StudentService();
        Student[] students = studentService.inputAllData(number);
        studentService.outputAll(students);
        System.out.println("The highest score: ");
        studentService.output(studentService.maxScore(students));
        studentService.searchByFirst(students);
        studentService.searchById(students);

    }
}
