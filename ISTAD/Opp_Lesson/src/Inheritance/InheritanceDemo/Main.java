package Inheritance.InheritanceDemo;

import java.util.Arrays;

class Person {
    String name;
    String gender;
    String address;
    int age;
    String dateOfBirth;

    void showInformation() {
        System.out.println("Name is: " + name);
        System.out.println("Gender is: " + gender);
        System.out.println("Address is: " + address);
        System.out.println("Age is: " + age);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}

class Student extends Person {
    int id;
    String classRoom;
    float[] scores;

    float findAverage() {
        float sum = 0;
        for (float score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", classRoom='" + classRoom + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}

class TopStudent extends Student {
    int numberOfAwards;
    int numberOfCertificates;
    String quote;
}

class Worker extends Person {
    int workerID;
    String position;
    float wage;
    float hours;

    float findSalary() {
        return this.wage * this.hours;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerID=" + workerID +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                ", hours=" + hours +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.id = 101;
        obj1.name = "John Snow";
        obj1.gender = "Male";
        obj1.age = 31;
        obj1.address = "Siem Reap";
        obj1.dateOfBirth = "12.12.1996";
        obj1.classRoom = "A3";
        obj1.scores = new float[]{20, 67, 98};
        obj1.showInformation();
        System.out.println(obj1);

        System.out.println("-------------------------");
        Worker obj2 = new Worker();
        obj2.name = "RODOLPHE";
        obj2.workerID = 102;
        obj2.hours = 90;
        obj2.wage = 15;
        //worker can access both the person's properties and properties of itself
        obj2.showInformation();
        System.out.println(obj2);

    }
}
