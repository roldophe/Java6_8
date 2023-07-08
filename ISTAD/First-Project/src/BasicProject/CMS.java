package BasicProject;

import java.util.Objects;
import java.util.Scanner;

public class CMS {

    public static void Continue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n==========================================");
        System.out.println("      Press any key to Continue...!");
        System.out.println("==========================================");
        scanner.nextLine();
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int setFloor;
        int setRoom;
        String[][] condo;
        String confirm;
        System.out.println("--------Setting Up Condo--------");
        while (true) {
            System.out.print("Enter number of floor: ");
            setFloor = scanner.nextInt();
            if (setFloor > 0)
                break;
            System.out.println("Invalid! Please enter a value bigger than 1.");
        }
        while (true) {
            System.out.print("Enter number of room : ");
            setRoom = scanner.nextInt();
            if (setRoom > 0)
                break;
            System.out.println("Invalid! Please enter a value bigger 0.");
        }
        condo = new String[setFloor][setRoom];
        System.out.println("You have successful setting up the condo!!!");
        System.out.println("Each floor has : " + setRoom + ((setFloor > 1) ? "rooms" : "room"));
        System.out.println("Number of floor is : " + setFloor + ((setFloor > 1) ? "floors" : "floor"));
        System.out.println("Total room are : " + (setFloor * setRoom) + ((setRoom > 1) ? "rooms" : "room"));
        int option;
        do {
            System.out.println("\n***************Welcome to Condo Management System***************");
            System.out.println("\t\t1. Buy the condo");
            System.out.println("\t\t2. Sell the condo");
            System.out.println("\t\t3. Show all the condo information");
            System.out.println("\t\t4. Search  condo information");
            System.out.println("\t\t5. Exit ");
            System.out.println("*****************************************************************");
            System.out.print("Choose your option from (1 - 5): ");
            option = scanner.nextInt();
            switch (option) {
                case 1: {
                    int buyRow, buyCol;
                    System.out.println("=========== Condo for sale ===========");
                    do {
                        while (true) {
                            System.out.print("Enter floor(1 - " + setFloor + "): ");
                            buyRow = scanner.nextInt();
                            if (buyRow > 0 && buyRow <= setFloor) break;
                            System.out.println("Invalid floor!! Your Range Start From (1 - " + setFloor + ").");
                        }
                        while (true) {
                            System.out.print("Enter Your Desired room(1 - " + setRoom + "): ");
                            buyCol = scanner.nextInt();
                            if (buyCol > 0 && buyCol <= setRoom) break;
                            System.out.println("Invalid room!! Your Range Start From (1 - " + setRoom + ").");
                        }
                        if ((condo[buyRow - 1][buyCol - 1] != null)) {
                            System.out.println("This condo has been Bought by someone else already.");
                        } else {
                            System.out.print("Enter your name: ");
                            scanner.nextLine();
                            condo[buyRow - 1][buyCol - 1] = scanner.nextLine();
                            System.out.println("Successful bought the condo.");
                        }
                        System.out.print("Do you want to buy one more?(Yes/No): ");
                        confirm = scanner.next();
                    } while (confirm.equalsIgnoreCase("yes"));
                    Continue();
                }
                break;
                case 2: {
                    System.out.println("------------Sell Condo------------");
                    int sellRow;
                    int sellCol;
                    do {
                        while (true) {
                            System.out.print("Enter floor(1 - " + setFloor + "): ");
                            sellRow = scanner.nextInt();
                            if (sellRow > 0 && sellRow <= setFloor)
                                break;
                            System.out.println("Invalid floor!! Your Range Start From (1 - " + setFloor + ").");
                        }
                        while (true) {
                            System.out.print("Enter Your Desired room(1 - " + setRoom + "): ");
                            sellCol = scanner.nextInt();
                            if (sellCol > 0 && sellCol <= setRoom)
                                break;
                            System.out.println("Invalid room!! Your Range Start From (1 - " + setRoom + ").");
                        }
                        if ((condo[sellRow - 1][sellCol - 1]) != null) {
                            System.out.println("Selected Condo information.");
                            System.out.println("Floor: " + sellRow + " Room : " + sellCol
                                    + " Belong to " + condo[sellRow - 1][sellCol - 1]);
                            System.out.println("Enter 1 to confirm and 0 to cancel.");
                            int confirmSell = scanner.nextInt();
                            if (confirmSell == 1) {
                                condo[sellRow - 1][sellCol - 1] = null;
                                System.out.println("Congratulation! You have successful sell your condo.");
                            } else {
                                System.out.println("You canceled your condo.");
                            }
                        } else {
                            System.out.println("Cannot Sell The Condo, Cause you don't have the ownership.");
                        }
                        System.out.print("Do you want to sell one more?(Yes/No): ");
                        confirm = scanner.next();

                    } while (confirm.equalsIgnoreCase("yes"));
                    Continue();
                }
                break;
                case 3: {
                    System.out.println("\n*******************Show all condo information*******************");
                    for (int i = condo.length - 1; i >= 0; i--) {
                        System.out.print("\nFloor[" + (i + 1) + "]:  ");
                        for (int j = 0; j < condo[i].length; j++) {
                            System.out.print("\t" + condo[i][j]);
                        }
                        System.out.print("\n\t\t  ");
                        for (int k = 0; k < setRoom; k++) {
                            System.out.print("---------");
                        }
                    }
                    Continue();
                }
                break;
                case 4: {
                    int manu;
                    do {
                        System.out.println("************Search condo information*************");
                        System.out.println("            ------------------------             ");
                        System.out.println("\t\t1. Search By Owner's Name");
                        System.out.println("\t\t2. Search By floor ");
                        System.out.println("\t\t3. Exit ");
                        System.out.println("            ------------------------             ");
                        System.out.print(" Please choose one (1-3): ");
                        manu = scanner.nextInt();
                        switch (manu) {
                            case 1 -> {

                                do {
                                    boolean search = false;
                                    System.out.print("Please Owner name for search : ");
                                    String searchName = scanner.next();
                                    for (int i = condo.length - 1; i >= 0; i--) {
                                        for (int j = 0; j < condo[i].length; j++) {
                                            if (Objects.equals(searchName, condo[i][j])) {
                                                search = true;
                                                System.out.println(condo[i][j] + " Stay in room: " + (i + 1) + " Floor No: " + (j + 1));
                                                break;
                                            }
                                        }
                                    }
                                    if (!search) {
                                        System.out.println(searchName + " is not present in our condo system...!");
                                    }
                                    System.out.print("Do you want to search again?(Yes/No): ");
                                    confirm = scanner.next();
                                } while (confirm.equalsIgnoreCase("yes"));
                            }
                            case 2 -> {
                                int searchFloor;
                                do {
                                    System.out.print("Please enter floor you want to search: ");
                                    searchFloor = scanner.nextInt();
                                    if (searchFloor > 0 && searchFloor <= setFloor) {
                                        System.out.print("Floor[" + (searchFloor) + "]:  ");
                                        for (int j = 0; j < condo.length; j++)
                                            System.out.print(condo[searchFloor - 1][j] + "  ");
                                        System.out.println();
                                    } else
                                        System.out.println(searchFloor + "floor is not present in our condo system...!");
                                    System.out.print("Do you want to search again?(Yes/No): ");
                                    confirm = scanner.next();
                                } while (confirm.equalsIgnoreCase("yes"));
                            }
                            case 3 -> System.out.println("You have exited from case 4.");
                            default -> System.out.println("Invalid manu!!");
                        }
                    } while (manu != 3);
                    Continue();
                }
                break;
                case 5:
                    System.out.println("Exit the program!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (option != 5);
    }
}
