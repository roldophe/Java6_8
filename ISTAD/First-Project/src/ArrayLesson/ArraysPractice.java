package ArrayLesson;

import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentID;
        String studentName;
        String gender;
        String classRoom;
        float average;
        float totalScore = 0;
        float[] scores = new float[5];
        System.out.println("============Student information===========");
        System.out.print("Enter student's id: ");
        studentID = scanner.nextInt();
        System.out.print("Enter student's name: ");
        scanner.nextLine();
        studentName = scanner.nextLine();
        System.out.print("Enter student's gender: ");
        gender = scanner.next();
        System.out.print("Enter class room: ");
        classRoom = scanner.next();
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score[" + (i + 1) + "]: ");
            scores[i] = scanner.nextFloat();
            totalScore += scores[i];
        }
        average = totalScore / scores.length;
        System.out.println("============Student Result============");
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + studentName);
        System.out.println("Gender: " + gender);
        System.out.println("Class Room: " + classRoom);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average: " + average);

    }
}
