package ArrayList.Univversity;

import java.util.ArrayList;
import java.util.Scanner;

public class University implements IFeature {
    private String name;
    private ArrayList<Student> students = new ArrayList<Student>();

    public University() {
    }

    public University(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
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

    @Override
    public University insert() {
        name = InputUtils.getStringLn(new Scanner(System.in), "Please Input Name of University: ");
        students.add(new Student().insert());
        return this;
    }

    @Override
    public void display() {
        System.out.println("Study at: " + name);
        for (Student student : students) {
            student.display();
        }
    }

    @Override
    public University update() {
        return this;
    }
}
