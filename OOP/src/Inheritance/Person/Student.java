package Inheritance.Person;

public class Student extends Person {
    private int grade;

    public Student() {
        super("RADOM", "male");
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{ name='" + name + '\'' + ", gender='" + gender + '\''
                + ", age=" + age + ", grade=" + grade + '}';
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
