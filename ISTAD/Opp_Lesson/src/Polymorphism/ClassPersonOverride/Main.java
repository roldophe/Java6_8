package Polymorphism.ClassPersonOverride;


import java.util.Arrays;
import java.util.Scanner;

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
        System.out.print("  Name: " + name);
        System.out.print("\t  Gender: " + gender);
        System.out.println("  Age: " + age);
    }

    Person input() {
        String name = Utils.getString("Please input name: ");
        String gender = Utils.getString("Please input gender: ");
        int age = Utils.getInteger("Please input age: ");
        return new Person(name, gender, age);
    }

    Person[] inputAll(int number) {
        Person[] people = new Person[number];
        for (int i = 0; i < people.length; i++) {
            System.out.println("Person[" + (i + 1) + "]: ");
            people[i] = input();
        }
        return people;
    }

    void ShowAllInformation(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            System.out.println("Person[" + (i + 1) + "]: ");
            people[i].ShowInformation();
        }
    }
}

class Student extends Person {
    int id;
    float[] scores;

    Student() {
        //System.out.println("\t=========Input All Student Information=========");
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
        float avg;
        avg=findAverage();
        return (avg >= 95 && avg <= 100) ? "A":
                (avg >= 85 && avg < 95) ? "B":
                 (avg >= 75 && avg < 85) ? "C":
                  (avg >= 65 && avg < 75) ? "D":
                   (avg >= 50 && avg < 65) ? "E":
                    (avg >= 0 && avg <50) ? "F":"Error";
    }

    @Override
    void ShowInformation() {
        System.out.print("\t\tID: " + id);
        super.ShowInformation();
        System.out.println("    \tScores: " + Arrays.toString(scores));
        System.out.printf("    \tAverage: %.2f", findAverage());
        System.out.println("  Grade: [" + findGrade() + "]");
    }

    @Override
    Student input() {
        int id = Utils.getInteger("Please input ID: ");
        String name = Utils.getString("Please input name: ");
        String gender = Utils.getString("Please input gender: ");
        int age = Utils.getInteger("Please input age: ");
        int number = Utils.getInteger("Please input number of scores: ");
        float[] scores = new float[number];
        System.out.println("Please input scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Utils.getFloat("\t\tScore[" + (i + 1) + "]:");
        }
        return new Student(id, name, gender, age, scores);
    }

    Student[] inputAll(int number) {
        Student[] students = new Student[number];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student[" + (i + 1) + "]: ");
            students[i] = input();
        }
        return students;
    }

    void ShowAllInformation(Student[] students) {
        System.out.println("\t===============Show All Student Information============");
        for (int i = 0; i < students.length; i++) {
            System.out.println("\t\t******************Student[" + (i + 1) + "]*******************");
            students[i].ShowInformation();
            System.out.println("\t=======================================================\n");
        }
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
        System.out.print("\t\tID: " + empId);
        super.ShowInformation();
        System.out.print("\t\tWage: " + wage + "$/h");
        System.out.print("\tHours: " + hours + ((hours > 1) ? "hours" : "hour"));
        if (income() < 1000) System.out.println("\n\t\tSalary: " + income() + "$" + "(Tax:0.0%)");
        else {
            System.out.println("  Income: " + income() + "$");
            System.out.print((getGender().equalsIgnoreCase("Male") ? "\t\tTax: 5%" : "\t\tTax:0.03%") + "(" + tax() + "$)");
            System.out.println("\tSalary: " + (income() - tax() + "$"));
        }
    }
    Worker input() {
        int emId = Utils.getInteger("Please input id: ");
        String name = Utils.getString("Please in name: ");
        String gender = Utils.getString("Please in gender: ");
        int age = Utils.getInteger("Please input age: ");
        float wage = Utils.getFloat("Please input wage: ");
        float hours = Utils.getFloat("Please input hours: ");
        return new Worker(emId, name, gender, age, wage, hours);
    }

    Worker[] inputAll(int number) {
        Worker[] workers = new Worker[number];
        for (int i = 0; i < workers.length; i++) {
            System.out.println("Worker[" + (i + 1) + "]: ");
            workers[i] = input();
        }
        return workers;
    }

    void ShowAllInformation(Worker[] workers) {
        for (int i = 0; i < workers.length; i++) {
            System.out.println("\t\t******************Worker[" + (i + 1) + "]*******************");
            workers[i].ShowInformation();
            System.out.println("\t=======================================================\n");
        }
    }

}

class Programmer extends Person {
    private int id;
    private int numberOfProjects;
    private float salary;
    private String[] skills;

    Programmer() {
    }

    Programmer(int id, int numberOfProjects, String name, String gender, int age, float salary, String[] skills) {
        super(name, gender, age);
        this.id=id;
        this.numberOfProjects = numberOfProjects;
        this.salary = salary;
        this.skills = skills;
    }
    @Override
    void ShowInformation() {
        System.out.print("\t\tID: "+id);
        super.ShowInformation();
        System.out.println("\t\tNumber of projects: " + numberOfProjects);
        System.out.print("\t\tSkills : " + Arrays.toString(skills));
        System.out.println("\tSalary: " + salary + "$");
    }

    Programmer input() {
        int id=Utils.getInteger("Please input gender: ");
        String name = Utils.getString("Please input name: ");
        String gender = Utils.getString("Please input gender: ");
        int age = Utils.getInteger("Please input age: ");
        float salary = Utils.getFloat("Please input salary: ");
        int numberOfProjects = Utils.getInteger("Please input numberOfProjects: ");
        int number = Utils.getInteger("Please input number of skills: ");
        String[] skills = new String[number];
        System.out.println("Please input skill: ");
        for (int i = 0; i < skills.length; i++) {
            skills[i] = Utils.getString("\t\tskill[" + (i + 1) + "]:");
        }
        return new Programmer(id,numberOfProjects, name, gender, age, salary, skills);
    }

    Programmer[] inputAll(int number) {
        Programmer[] programmers = new Programmer[number];
        for (int i = 0; i < programmers.length; i++) {
            System.out.println("Programmer[" + (i + 1) + "]: ");
            programmers[i] = input();
        }
        return programmers;
    }

    void ShowAllInformation(Programmer[] programmers) {
        System.out.println("\t==============Show All Programmer Information===========");
        for (int i = 0; i < programmers.length; i++) {
            System.out.println("\t\t*****************Programmer[" + (i + 1) + "]******************");
            programmers[i].ShowInformation();
            System.out.println("\t=======================================================\n");
        }
    }
}

class Utils {
    public static void Manu(){
        System.out.println("*******************Manu*********************");
        System.out.println("           1. Input    Application         ");
        System.out.println("           2. Output   Application         ");
        System.out.println("           3. Exit       Application       ");
        System.out.println("********************************************");
    }
    public static String getString(String label) {
        System.out.print(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static String getStringLn(String label) {
        System.out.print(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getInteger(String label) {
        String text = getString(label);
        return Integer.parseInt(text);
    }

    public static Double getDouble(String label) {
        String text = getString(label);
        return Double.parseDouble(text);
    }

    public static float getFloat(String label) {
        String text = getString(label);
        return Float.parseFloat(text);
    }
}

public class Main {
    public static void main(String[] args) {
        int number, option;
        do {
            System.out.println("*******************Manu*********************");
            System.out.println("           1. Student    Application         ");
            System.out.println("           2. Worker     Application         ");
            System.out.println("           3. Programmer Application         ");
            System.out.println("           4. Exit       Application         ");
            System.out.println("********************************************");
            option = Utils.getInteger("Please choose one option: ");
            switch (option) {
                case 1 -> {
                    Student student = new Student();
                    Student[] students = new Student[]{};
                    do {
                        Utils.Manu();
                        option = Utils.getInteger("Please choose one option: ");
                        switch (option) {
                            case 1 -> {
                                System.out.println("=========Input All Student Information=========");
                                number = Utils.getInteger("Please input number of students: ");
                                students = student.inputAll(number);
                            }
                            case 2 -> student.ShowAllInformation(students);
                            case 3 -> System.out.println("Exiting program...!");
                            default -> System.out.println("Error!Choose a valid manu option.");
                        }
                    } while (option != 3);
                }
                case 2 -> {
                    Worker worker = new Worker();
                    number = Utils.getInteger("Please input number of Workers: ");
                    Worker[] workers = worker.inputAll(number);
                    System.out.println("\t===============Show All Worker Information============");
                    worker.ShowAllInformation(workers);
                }
                case 3 -> {
                    Programmer programmer = new Programmer();
                    System.out.println("=============Input All Programmer Information=============");
                    number = Utils.getInteger("Please input number of programmer: ");
                    Programmer[] programmers = programmer.inputAll(number);
                    programmer.ShowAllInformation(programmers);
                }
                case 4 -> System.out.println("Exiting program...!");
                default -> System.out.println("Error!Choose a valid manu option.");
            }
        } while (option != 4);

    }
}

