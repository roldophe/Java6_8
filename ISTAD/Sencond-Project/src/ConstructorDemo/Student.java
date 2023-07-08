package ConstructorDemo;

public class Student {

    //There are two types of constructor
    // 1. Constructor with parameter
    // 2. Constructor without parameter
    // -- Default constructor

    //*** assign custom default value for the object
    //constructor without parameter
    public Student() {
        //assign values for the object
        //gender="male";
        //classRoom = "Java programming class";
        System.out.println("----------------Constructor without parameters is invoked!--------------");
    }

    //constructor with parameters
    public Student(int studentID, String studentName, String gender, String classRoom, float score) {
        //assign instance variable  =  parameters
        this.studentID = studentID;
        this.studentName = studentName;
        this.gender = gender;
        this.classRoom = classRoom;
        this.scores = score;
        System.out.println("----------------Constructor with parameters is invoked!--------------");
    }

    int studentID;
    String studentName;
    String gender;
    String classRoom;
    float scores;

}
