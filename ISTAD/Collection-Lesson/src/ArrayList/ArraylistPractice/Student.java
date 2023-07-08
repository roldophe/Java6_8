package ArrayList.ArraylistPractice;

import java.util.ArrayList;
import java.util.List;

public class Student implements Service{
    private int id;
    private String name;
    private String gender;
    private int age;
    private List<Float> scores = new ArrayList<>();// float[] scores;
    public Student(){}
    public Student (int id, String name , String gender, int age, List<Float> scores){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.scores=scores;
    }
    public float findAverage(){
        float sum=0;
        for (Float score: scores)
            sum+=score;
        return sum/ scores.size();
    }
    public int getId(){
        return id;
    }
    public String gradeFinder(){
        float average = findAverage();
        return (average>=95 && average<=100)?"A":
                (average>=85 && average<95)?"B":
                  (average>=75 && average<85)?"C":
                    (average>=65 && average<75)?"D":
                      (average>=50 && average<65)?"E":
                        (average>0 && average<50)?"F":"Error";
    }

    @Override
    public Student insert() {
        System.out.println("======<<<<Please insert Student Information>>>>======");
        id=Utils.getInt("\tInput id:");
        name =Utils.getString("\tInput name: ");
        gender=Utils.getString("\tInput gender: ");
        age=Utils.getInt("\tInput age: ");
        int number= Utils.getInt("\tInput number of scores: ");
        for (int i=0; i<number; i++)
            scores.add(Utils.getFloat("\t\tScore["+(i+1)+"]:"));
        return this;
    }

    @Override
    public Student update() {
        name =Utils.getString("\tInput name: ");
        gender=Utils.getString("\tInput gender: ");
        age=Utils.getInt("\tInput age: ");
        int number= Utils.getInt("\tInput number of scores: ");
        for (int i=0; i<number; i++)
            scores.add(Utils.getFloat("\t\tScore["+(i+1)+"]:"));
        return this;
    }
    @Override
    public void show() {
        System.out.println("=========<<<<Student Information>>>>=======");
        System.out.println("\t\tID: "+id);
        System.out.println("\t\tName: "+name);
        System.out.println("\t\tGender: "+gender);
        System.out.println("\t\tAge: "+age);
        System.out.println("\t\tScores: "+scores);
        System.out.println("\t\tAverage: "+findAverage()+"  Grade: ["+gradeFinder()+"]");
    }
    @Override
    public String getObjectType() {
        return this.getClass().getSimpleName();
    }
}
