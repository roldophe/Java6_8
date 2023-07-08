package ArrayList.Univversity;

import java.util.Scanner;

public class InputUtils {
    public static String getStringLn(Scanner scanner, String label) {
        System.out.print(label);
        return scanner.nextLine();
    }

    public static float getFloat(Scanner scanner, String label) {
        while (true) {
            try {
                System.out.print(label);
                return scanner.nextFloat();
            } catch (Exception ex) {
                System.out.println("Error! value must be a number!");
                scanner.nextLine();
            }
        }
    }

    public static int getInt(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (Exception ex) {
                System.out.println("Error! value must be a number!");
                scanner.nextLine();
            }
        }
    }
}
