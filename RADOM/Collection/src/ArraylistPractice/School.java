package ArraylistPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class School {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();
//
//    public School(){
//        students = new ArrayList<>();
//    }
    public void registerStudent(Student student){
            students.add(student);
    }
    public void displayStudents(){
        for(Student student:  students){
            System.out.println("ID: %d, Name: %s , Gender: %s".formatted(student.getId(),student.getName(),student.getGender()));
        }
    }
    public void removeStudent(int studentId){
//        for (Student student: students){
//            if (student.getId()==studentId){
//                students.remove(student);
//            }
//        }//cannot remove
       // Iterator<Student> iterator = students.iterator();
//        while (iterator.hasNext()){
//            Student student = iterator.next();
//            if (student.getId()==studentId){
//                iterator.remove();
//            }
//        } //it's okay
        students.removeIf(student -> student.getId() == studentId);
    }
    public void sortByName(){
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        students.sort(comparator);
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
