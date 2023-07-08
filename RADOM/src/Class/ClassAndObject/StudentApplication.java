package Class.ClassAndObject;

public class StudentApplication {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        //Student student = studentService.createStudent();
        //System.out.println("Name: "+student.getName()+", Gender: "+student.getGender()+", Age: "+student.getAge());
        int numberOfStudent = 3;
        Student[] students = studentService.createStudents(numberOfStudent);

        System.out.println("----------------------");
        System.out.println("Print by function: ");
        studentService.print(students);

        System.out.println("----------------------");
        System.out.println("After sorting by Name:");
        studentService.sortByName(students);
        studentService.print(students);

        System.out.println("----------------------");
        System.out.println("After sorting by Age:");
        studentService.sortByAge(students);
        studentService.print(students);

        System.out.println("----------------------");
        System.out.println("The oldest Age in our system");
        System.out.println(studentService.getOldestAge(students));
        System.out.println("----------------------");


/**
 System.out.println("Print with toString");
 for (int i=0; i<students.length; i++){
 System.out.print("Student["+(i+1)+"]:");
 System.out.println(students[i].toString());
 }
 */
/**
 System.out.println("Print with toInfo");
 for (int i=0; i<students.length; i++){
 System.out.println("Student["+(i+1)+"]:");
 System.out.println(students[i].toInfo());
 }
 */
/**
 System.out.println("Using for each loop: ");
 for (Student student : students) {
 System.out.println("Name: " + student.getName() + ", Gender: " + student.getGender() + ", Age: " + student.getAge());
 }

 */
/**
 System.out.println("Using for loop: ");
 for (int i=0; i<students.length; i++){
 System.out.println("Student["+(i+1)+"]:");
 System.out.println("Name: "+students[i].getName()+", Gender: "+students[i].getGender()+", Age: "+students[i].getAge());
 }

 */

    }
}
