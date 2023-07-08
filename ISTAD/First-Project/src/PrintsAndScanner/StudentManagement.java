package PrintsAndScanner;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // local variables
        byte id;
        String studentName;
        char studentGender;
        float totalScore;
        float average;
        String classroom;

        System.out.print("Enter id: ");
        id = scanner.nextByte();

        System.out.print("Enter student's Name:");
        scanner.nextLine(); // clear space
        studentName = scanner.nextLine();

        System.out.print("Enter student's Gender:");
        studentGender = scanner.next().charAt(0);

        System.out.print("Enter Total Score:");
        totalScore = scanner.nextFloat();

        System.out.print("Enter Average:");
        average = scanner.nextFloat();

        System.out.print("Enter Class Room:");
        scanner.nextLine(); // clear space
        classroom = scanner.nextLine();

        System.out.println("==========Student inforamtion===========");
        System.out.println("Student ID : " + id);
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Gender: " + studentGender);
        System.out.println("Student Total score: " + totalScore);
        System.out.println("Student Average: " + average);
        System.out.println("Class Room : " + classroom);
    }
}
