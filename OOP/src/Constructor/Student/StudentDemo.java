package Constructor.Student;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("Thida",23);
        System.out.println("Name: "+student.getName());

        Student student1 = new Student("RADOM");
        System.out.println("Name: "+student1.getName());
    }
}
