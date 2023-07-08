package ArrayList.ArraylistStudent;

public class SchoolApp {
    public static void main(String[] args) {
        School school = new School();
        school.setName("RUPP");

        Student st1 = new Student(101,"RADOM",Gender.M);
        Student st2 = new Student(102,"ROLDOPHE",Gender.M);

        school.register(st1);
        school.register(st2);
        System.out.println(school.getStudents());
        school.displayStudents();
        System.out.println("==================");
        System.out.println("After remove!");
        school.removeStudentID(101);
        school.displayStudents();

    }
}
