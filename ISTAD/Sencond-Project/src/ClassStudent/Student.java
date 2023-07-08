package ClassStudent;

import java.util.Arrays;

public class Student {
    int id;
    String name;
    String gender;
    String classRoom;
    float[] scores;

    public Student() {
        this.id = 0;
        this.name = "null";
        this.gender = "null";
        this.classRoom = "null";
        scores = new float[]{};
        System.out.println("----------------Constructor without parameters is invoked!--------------");
    }

    public Student(int id, String name, String gender, String classRoom, float[] scores) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.classRoom = classRoom;
        this.scores = scores;
        System.out.println("----------------Constructor with parameters is invoked!--------------");
    }

    float findAverage() {
        float sum = 0;
        for (Float score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    String gradeFinder() {
        float average = findAverage();
        return (average <= 100 && average >= 95) ? "A" : (average >= 85) ? "B" :
                (average >= 75) ? "C" : (average >= 65) ? "D" : (average >= 50) ? "E" : "F";
    }

    public void output() {
        System.out.println("        ----------------Result------------------");
        System.out.println("        **** ID : " + this.id);
        System.out.println("        **** NAME     : " + this.name);
        System.out.println("        **** GENDER : " + this.gender);
        System.out.println("        **** CLASS  : " + this.classRoom);
        System.out.println("        **** SCORES : " + Arrays.toString(this.scores));
        System.out.println("        **** AVERAGE: " + findAverage());
        System.out.println("        **** GRADE  : " + gradeFinder());
        System.out.println("===============================================");
    }
}
