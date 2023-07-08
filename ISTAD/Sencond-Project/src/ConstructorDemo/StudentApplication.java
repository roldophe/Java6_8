package ConstructorDemo;

public class StudentApplication {
    public static void main(String[] args) {
        StudentService studentService =  new StudentService();
        Student student = new Student();
        studentService.print(student);

        Student student1 = new Student(101,"RADOM","male","JAVA",85);
        studentService.print(student1);
    }
}
