package ArraylistPractice;

public class SchoolApp {
    public static void main(String[] args) {
        School school = new School();
        school.setName("RADOM JAVA School");

        //Register student
        Student st1 = new Student(1,"Roldophe","male");
        Student st2 = new Student(2,"RAODM","male");
        Student st3 = new Student(2,"Enzo","male");
        Student st4 = new Student(2,"Luoiz","female");
        school.registerStudent(st1);
        school.registerStudent(st2);
        school.registerStudent(st3);
        school.registerStudent(st4);
       // System.out.println(school.getStudents());
        school.displayStudents();
        System.out.println("After remove");
        school.removeStudent(2);
        school.displayStudents();
    }
}
