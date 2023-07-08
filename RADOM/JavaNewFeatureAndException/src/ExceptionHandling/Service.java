package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Service {
    public static int getInteger(Scanner scanner, String label, List<Programmer> allProgrammer) throws Exception {
        while (true) {
            try {
                System.out.print(label);
                int value = scanner.nextInt();
                if (value <= 0) {
                    throw new Exception("Please input a value that's positive.");
                }
                if (allProgrammer != null) {
                    int id = allProgrammer.stream().map(Programmer::getId).filter(
                            s -> s == value
                    ).findFirst().orElse(-1);
                    if (id != -1) {
                        throw new Exception("Duplicate value! Try again...");
                    }
                }
                return value;
            } catch (InputMismatchException ex) {
                System.out.println("Bad entry! Only positive numbers & no letters please. ");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Error! " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
    public static float getFloat(Scanner scanner, String label) throws Exception {
        while (true) {
            try {
                System.out.print(label);
                float value = scanner.nextFloat();
                if (value < 0) {
                    throw new Exception("Please input a positive number.");
                }
                return value;
            } catch (InputMismatchException ex) {
                System.out.println("Only positive numbers & no letters please. ");
                scanner.nextLine();
            } catch (Exception fl) {
                System.out.println("Bad entry!" + fl.getMessage());
                scanner.nextLine();
            }
        }
    }
    public static String getString(Scanner scanner, String label) {

        while (true) {
            try {
                System.out.print(label);
                String message = scanner.nextLine();
                boolean isDigit = false;
                char[] messageCharacter = message.toCharArray();
                for (char character : messageCharacter) {
                    isDigit = Character.isDigit(character);
                }
                if (!isDigit) {
                    return message;
                } else {
                    throw new Exception("Name must not contain number!!");
                }
            } catch (Exception e) {
                System.out.println("Error! " + e.getMessage());
            }
        }
    }
    public static void outputFrame(String message) {
        System.out.println("***********<<" + message + ">>**********");
    }
}
