package ClassStudent;

import static ClassStudent.StudentService.getInteger;

public class StudentApplication {
    public static void main(String[] args) {

        int number = getInteger("Please input number of student: ");
        Student student = new Student() ;
        student.output();
        StudentService studentService = new StudentService();
        Student[] students = studentService.inputAll(number);
        studentService.outputAll(students);

        System.out.println("The highest score: ");
        Student maxScore = studentService.maxScore(students);
        maxScore.output();

        System.out.println("Search by name");
        studentService.searchByName(students);

        System.out.println("Search by id");
        studentService.searchByID(students);
    }
}
