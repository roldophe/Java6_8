package Utils;

import StreamLession.Model.Student;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Helper {
    public static int readInt(Scanner scanner, String message, List<Student> allStudents) {
        while (true) {
            try {
                System.out.print(message);
                int number = scanner.nextInt();
                if (number <= 0) {
                    throw new Exception("Number must be greater than zero!");
                }
                if (allStudents != null) {
                    int id = allStudents.stream().map(Student::getId).filter(
                            studentId -> studentId == number
                    ).findFirst().orElse(-1);
                    if (id != -1) {
                        throw new Exception("Duplicate entry!! Try again...");
                    }
                }
                return number;
            } catch (InputMismatchException ex) {
                System.out.println("Error! Please input a number that's positive.");
                scanner.nextLine();
            } catch (Exception ex) {
                System.out.println("Error!" + ex.getMessage());
                scanner.nextLine();
            }
        }
    }

}
