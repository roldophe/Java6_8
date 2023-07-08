package ArrayList.ArraylistStudent;

import java.util.ArrayList;

public class School {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public School() {
    }

    public School(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public void register(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println("School: "+name);
            System.out.printf("ID: %d Name: %s   Gender: %s%n", student.getId(), student.getName(), student.getGender());
        }
    }

    public void removeStudentID(int studentId) {
//        for(Student student: students){
//            if (student.getId()==studentId)
//            {
//                students.remove(student);
//            }
//        }
        students.removeIf(student -> student.getId() == studentId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
