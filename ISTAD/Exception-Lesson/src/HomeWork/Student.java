package HomeWork;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private int id;
    private String name;
    private String gender;
    private int age;
    private Set<String> subjects = new HashSet<>();
    public Student() {
    }
    public Student(int id, String name, String gender, int age, Set<String> subjects) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.subjects = subjects;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Set<String> getSubjects() {
        return subjects;
    }
    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }
}
