package HomeWork;

import java.util.Scanner;

public class Service {
    public static String getStringLn(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static String getString(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static int getInteger(Scanner scanner, String message) {
        while (true) {
            try {
                String text = getString(scanner, message);
                int value = Integer.parseInt(text);
                if (value < 0)
                    throw new InvalidException("Negative number entered");
                return value;
            } catch (InvalidException ex) {
                System.out.println("Error : " + ex.getMessage());
            } catch (Exception ex) {
                System.out.println("\"Value must be number not string \"");
            }
        }
    }
}
