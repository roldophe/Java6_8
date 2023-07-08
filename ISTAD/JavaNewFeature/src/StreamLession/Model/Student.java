package StreamLession.Model;

import Utils.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String gender;
    private String classroom;
    private List<Float> scores = new ArrayList<>();
    public Student(){}
    public Student(int id, String name, String gender, String classroom,List<Float> scores){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.classroom=classroom;
        this.scores=scores;
    }
    public float findAverage(){
        float sum=0;
        for(Float score: scores){
            sum+=score;
        }
        return sum/scores.size();
    }
    public Student insertStudent(Scanner scanner,List<Student> allStudentList){

        id= Helper.readInt(scanner,"Enter student id: ",allStudentList);
        System.out.print("Enter student name: ");
        scanner.nextLine();
        name=scanner.nextLine();
        System.out.print("Enter student gender: ");
        gender=scanner.nextLine();
        System.out.print("Enter student classroom:");
        classroom=scanner.nextLine();
        //System.out.print("Enter number of scores: ");
        int number = Helper.readInt(scanner,"Enter number of scores: ",null);
        for(int i=0; i<number; i++) {
            System.out.print("Score[" + (i + 1) + "]: ");
            scores.add(scanner.nextFloat());
        }
        return this;
    }
    public void outputStudent(){

        System.out.printf("ID: %d Name: %s Gender: %s%n",id,name,gender);
        System.out.println("Classroom: "+classroom);
        System.out.println("Scores: "+scores);
        System.out.println("Average: "+findAverage());
        System.out.println("------------------------------------------------");

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public List<Float> getScores() {
        return scores;
    }

    public void setScores(List<Float> scores) {
        this.scores = scores;
    }
}
