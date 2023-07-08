package ControlFlows;

import java.util.Scanner;

public class FindGrade {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int score;
        char grade;
        while (true) {
            System.out.print("Enter student's name: ");
            name = scanner.nextLine();
            if ((name != null) && !name.equals("") && (name.matches("^[a-zA-Z]*$")))
                break;
            System.out.println("Enter only letters.");
        }
        while (true) {
            System.out.print("Enter score: ");
            score = scanner.nextInt();
            if (score >= 0 && score <= 100) break;
            System.out.println("Enter a score between 0 and 100.");
        }

        if (score >= 95) {
            grade = 'A';
        } else if (score >= 85) { //score < 95 && score >= 85
            grade = 'B';
        } else if (score >= 75) { //score < 85 && score >= 75
            grade = 'C';
        } else if (score >= 65) { //score < 75 && score >= 65
            grade = 'D';
        } else if (score >= 50) { //score < 65 && score >= 50
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("=======Student Result========");
        System.out.println("Name: " + name);
        System.out.println("score: " + score);
        System.out.println("grade: " + grade);
    }
}
