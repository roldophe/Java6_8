package BasicProject;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of student: ");
        int numberOfStudent = scanner.nextInt();
        int numberOfSubject = 5;
        int[] id  = new int[numberOfStudent];
        String[] studentName  = new String[numberOfStudent];
        String[] gender       = new String[numberOfStudent];
        float[]  scores       = new float[numberOfSubject];
        float[]  totalScores  = new float[numberOfStudent];
        float[]  average      = new float[numberOfStudent];
        char[]   grade        = new char[numberOfStudent];
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("========= Student[" + (i + 1) + "]" + " ==========");
            System.out.print("Enter student's id      : "); id[i] = scanner.nextInt();
            System.out.print("Enter student's name    : "); scanner.nextLine(); studentName[i] = scanner.nextLine();
            System.out.print("Enter student's gender  : "); gender[i] = scanner.next();
            System.out.println("Enter student's scores: ");
            for (int j = 0; j < numberOfSubject; j++) {
                System.out.print("Enter " + ((j == 0) ? "Math " : (j == 1) ? "Khmer" : (j == 2) ?
                                                        "Java " : (j == 3) ? "HTML " : "C#   ") + ": ");
                scores[j] = scanner.nextFloat();
                totalScores[i] += scores[j];
            }
            average[i] = totalScores[i] / numberOfSubject;
            if (average[i] >= 95) grade[i] = 'A';
            else if (average[i] >= 85) grade[i] = 'B';
            else if (average[i] >= 75) grade[i] = 'C';
            else if (average[i] >= 65) grade[i] = 'D';
            else if (average[i] >= 50) grade[i] = 'E';
            else grade[i] = 'F';
        }
        System.out.println("============= Student Result =============");
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("********* Student[" + (i + 1) + "] *********");
            System.out.println("Student's id     : " + id[i]);
            System.out.println("Student's name   : " + studentName[i]);
            System.out.println("Student's gender : " + gender[i]);
            System.out.println("Student's scores : ");
            for (int j = 0; j < numberOfSubject; j++) {
                System.out.print("\t" + ((j == 0) ? "Math " : (j == 1) ? "Khmer" : (j == 2) ?
                                                    "Java " : (j == 3) ? "HTML " : "C#   ") + ": ");
                System.out.println(scores[j]);
            }
            System.out.println("\tTotal: " + totalScores[i]);
            System.out.println("\tAVG  : " + average[i]);
            System.out.println("\tGrade: " + grade[i]);
        }
    }
}
