package Loops;

import java.util.Scanner;

public class ControlFlowPractice {
    public static void main(String[] args){
        int mainOption;
        int option;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("---------My Program---------");
            System.out.println("1. Calculator");
            System.out.println("2. Money Exchange");
            System.out.println("3. Sum of Values");
            System.out.println("4. Odd/Even printer");
            System.out.println("5. Exit ");
            System.out.print("Choose your option (1-5): ");
            mainOption = scanner.nextInt();
            switch (mainOption) {
                case 1 -> {
                    System.out.print("Enter value1: ");
                    int value1 = scanner.nextInt();
                    System.out.print("Enter value2: ");
                    int value2 = scanner.nextInt();
                    System.out.print("Please choose a operation(+,-,*,/):");
                    char operator = scanner.next().charAt(0);
                    System.out.print("Result: ");
                    switch (operator) {
                        case '+' -> System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
                        case '-' -> System.out.println(value1 + " - " + value2 + " = " + (value1 - value2));
                        case '*' -> System.out.println(value1 + " * " + value2 + " = " + (value1 * value2));
                        case '/' -> System.out.println(value1 + " / " + value2 + " = " + (value1 / value2));
                        default  -> System.out.println("Invalid!");
                    }
                }
                case 2 -> {
                    float KHR = 4000;
                    float amount;
                    do {
                        System.out.println("1. USD to KHR");
                        System.out.println("2. KHR to USD");
                        System.out.print("Please choose your option:  ");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1 -> {
                                System.out.print("Enter money in USD: ");
                                amount = scanner.nextFloat();
                                System.out.println(amount + "USD" + " = " + amount * KHR + "KHR");
                            }
                            case 2 -> {
                                System.out.print("Enter money in Khmer : ");
                                amount = scanner.nextFloat();
                                System.out.println(amount + "KHR" + " = " + amount / KHR + "USD");
                            }
                            case 3 ->  System.out.println("Exit from exchange program!");
                            default -> System.out.println("Invalid option, please choose again form 1 to 3!");
                        }
                    } while (option != 3); // end do while case 2
                } // end case 2
                case 3 -> {
                    int total = 0;
                    int number;
                    do {
                        System.out.println("************** Sum Operations **************");
                        System.out.println("1. Even integers");
                        System.out.println("2. Odd integers");
                        System.out.println("3. Exit ");
                        System.out.print("Please choose your option: ");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1: {
                                System.out.print("Please enter a number: ");
                                number = scanner.nextInt();

                                for (int i = 2; i <= number * 2; i += 2) {
                                    System.out.print("\t" + i);
                                    total += i;
                                }
/**
 *
 *                               for (int i = 1; i <= number; i++) {
 *                                     System.out.print("\t" + (2 * i));
 *                                     total += (2 * i);
 *                                }
 * */
                                System.out.println();
                                System.out.println("Result : " + total);
                            } break;
                            case 2: {
                                total = 0;
                                System.out.print("Please enter a number: ");
                                number = scanner.nextInt();
                                for (int i = 1; i < number * 2; i += 2) {
                                    System.out.print("\t" + i);
                                    total += i;
                                }
/**
 *
 *                               for (int i = 0; i < number; i++) {
 *                                     System.out.print("\t" + (2 * i + 1));
 *                                    total += (2 * i + 1);
 *                                 }
*/
                                System.out.println();
                                System.out.println("Result : " + total);
                            } break;
                            case 3: {
                                System.out.println("Exit the program!");
                            }
                            default:
                                System.out.println("Invalid option!!");
                        }
                    } while (option != 3); // end do while case 3
                } //end case 3
                case 4 -> {
                    do {
                        System.out.println("1. Even printer");
                        System.out.println("2. Odd printer");
                        System.out.print("Please choose one option: ");
                        option = scanner.nextInt();
                        System.out.print("Please enter a value: ");
                        int value = scanner.nextInt();
                        System.out.print("Result: ");
                        switch (option) {
                            case 1 -> {
                                for (int i = 1; i <= value; i++)
                                    if (i % 2 == 0)
                                        System.out.print(i + " ");
                                System.out.println();
                            }
                            case 2 -> {
                                for (int i = 1; i <= value; i++)
                                    if (i % 2 != 0)
                                        System.out.print(i + " ");
                                System.out.println();
                            }
                            default -> System.out.println("Invalid!!");
                        }
                    } while (option != 3); // end do while case 4
                } // end case 4
                case 5 -> System.out.println("Exit the program!"); // end case 5
                default -> System.out.println("Invalid option.");// end case default
            }//end main switch case
        } while (mainOption != 5);// end main do while
    }
}