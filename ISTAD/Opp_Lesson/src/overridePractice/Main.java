package overridePractice;

import java.util.Arrays;

//practice
//class Person
//class Student ->id, scores[],findAverage,output()(show grade)
//class Worker -> wage, hours, findSalary(),output()->tax apply
//class Programmer - >  numberOfProjects, salary, skills(String[]), output
class Person {
    private String name;
    private String gender;
    private int age;

    public String getGender() {
        return gender;
    }

    Person() {
    }

    Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    void ShowInformation() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }

}

class Student extends Person {
    int id;
    float[] scores;

    Student() {
    }

    Student(int id, String name, String gender, int age, float[] scores) {
        super(name, gender, age);
        this.id = id;
        this.scores = scores;
    }

    float findAverage() {
        float sum = 0;
        for (Float score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    String findGrade() {
        float avg = findAverage();
        return (avg >= 95 && avg <= 100) ? "A" : (avg >= 85) ? "B" : (avg >= 75) ? "C" : (avg >= 65) ? "D" : (avg >= 50) ? "E" : "F";
    }

    @Override
    void ShowInformation() {
        System.out.println("ID: " + id);
        super.ShowInformation();
        System.out.println("Scores: " + Arrays.toString(scores));
        System.out.println("Average: " + findAverage());
        System.out.println("Grade: " + findGrade());
    }
}

class Worker extends Person {
    int empId;
    float wage;
    float hours;

    Worker() {
    }

    Worker(int emId, String name, String gender, int age, float wage, float hours) {
        super(name, gender, age);
        this.empId = emId;
        this.wage = wage;
        this.hours = hours;
    }

    float income() {
        return wage * hours;
    }

    float tax() {
        float salary = income();
        return ((salary >= 1000) ? getGender().equalsIgnoreCase("male") ? salary * 0.05f : salary * 0.03f : salary);
    }

    @Override
    void ShowInformation() {
        System.out.println("ID: " + empId);
        super.ShowInformation();
        System.out.println("Wage: " + wage + "$/h");
        System.out.println("Hours: " + hours + ((hours > 1) ? "hours" : "hour"));
        if (income() < 1000) System.out.println("Salary: " + income() + "$" + "(Tax:0.0%)");
        else {
            System.out.println("Income: " + income() + "$");
            System.out.println((getGender().equalsIgnoreCase("Male") ? "Tax: 5%" : "Tax:0.03%") + "(" + tax() + "$)");
            System.out.println("Salary: " + (income() - tax() + "$"));
        }
    }

}

class Programmer extends Person {
    int numberOfProjects;
    float salary;
    String[] skills;

    Programmer() {
    }

    Programmer(int numberOfProjects, String name, String gender, int age, float salary, String[] skills) {
        super(name, gender, age);
        this.numberOfProjects = numberOfProjects;
        this.salary = salary;
        this.skills = skills;
    }

    @Override
    void ShowInformation() {
        super.ShowInformation();
        System.out.println("Number of projects: " + numberOfProjects);
        System.out.println("Salary: " + salary + "$");
        System.out.println("Skills : " + Arrays.toString(skills));
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student(101, "RADOM KHOEM", "Male", 21, new float[]{67, 80, 97});
        System.out.println("==============Show Student Information=============");
        student.ShowInformation();
        System.out.println("===================================================");

        Worker worker = new Worker(101, "Isabella", "Female", 24, 25, 60);
        System.out.println("==============Show Employee Information=============");
        worker.ShowInformation();
        System.out.println("===================================================");
        Programmer programmer = new Programmer(3, "Roldophe", "Male", 22, 1500, new String[]{"java", "SQL", "Research"});
        System.out.println("==============Show Programmer Information=============");
        programmer.ShowInformation();
        System.out.println("===================================================");

    }
}
