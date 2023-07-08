package BasicProject;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op, room, floor;
        String con = "";
        do {
            System.out.println("||||=====Setting Up The Condo=====||||");
            System.out.print("==> Enter Your Floor :");
            floor = sc.nextInt();
            if (!(floor > 0)) {
                System.out.println("Floor Cannot Be Zero or Negative.");
                System.out.println("Please Input 'yes' for try again.");
                con = sc.next();
            } else {
                System.out.print("==> Enter Your Room :");
                room = sc.nextInt();
                if (!(room > 0)) {
                    System.out.println("Floor Cannot Be Zero or Negative.");
                    System.out.println("Please Input 'yes' for try again.");
                    con = sc.next();
                } else {
                    String manuList = "";

                    System.out.println("=======================");
                    System.out.println("You have successfully set up the condo");
                    System.out.println("Number Of Floor :" + floor + " Floor" + ((floor > 1) ? "s" : ""));
                    System.out.println("Number Of Floor :" + room + " Room" + ((room > 1) ? "s" : ""));
                    int totalCondo = floor * room;
                    System.out.println("Total Condo :" + totalCondo + " Condo" + ((totalCondo > 1) ? "s" : ""));
                    String[][] condo = new String[floor][room];
                    do {
                        System.out.println("||||======Welcome To Condo Management System=====||||");
                        System.out.println("==> 1. Buy Condo");
                        System.out.println("==> 2. Sell Condo");
                        System.out.println("==> 3. Search Information.");
                        System.out.println("==> 4. Display Information.");
                        System.out.println("==> 5. Exit");
                        System.out.println("=======================");
                        System.out.print("Please Choose Option manu (1-5) :");
                        op = sc.nextInt();

                        switch (op) {
                            case 1: {
                                System.out.println("-----------------Buy Condo---------------");
                                int row, col;
                                System.out.print("==> Enter Your desired floor ( 1 - " + floor + ") :");
                                row = sc.nextInt();
                                if (!(row > 0) || row > floor) {
                                    System.out.println("Your Range Start From 1-" + floor);
                                } else {
                                    System.out.print("==> Enter Your desired room(1 - " + room + ") :");
                                    col = sc.nextInt();
                                    if (!(col > 0) || col > room) {
                                        System.out.println("Your Range Start From 1-" + room);
                                    } else {
                                        int a = row, b = col;
                                        if (!(condo[row - 1][col - 1] == condo[a][b])) {
                                            System.out.println("This condo has been Bought by someone else already.");
                                        } else {
                                            System.out.print("Input Your Name :");
                                            condo[row - 1][col - 1] = sc.next();
                                            System.out.println("Successful bought the Condo.");
                                        }
                                    }
                                }

                            }
                            break;
                            case 2:
                                int sellRow, sellCol;
                                System.out.println("-----------------SellCondo---------------");
                                System.out.print("Enter The Floor :");
                                sellRow = sc.nextInt();
                                System.out.print("Enter The Room :");
                                sellCol = sc.nextInt();
                                int a = sellRow, b = sellCol;
                                if (!(condo[sellRow - 1][sellCol - 1] == condo[a][b])) {
                                    System.out.println("Selected Condo Information.");
                                    System.out.println("Floor :" + sellRow + " Room :" + sellCol + " Belong To :" + condo[sellRow - 1][sellCol - 1]);

                                    System.out.println("Enter 1 to confirm and 0 to cancel.");
                                    int confirmSell = sc.nextInt();
                                    if (confirmSell == 1) {
                                        System.out.println("Congratulation ! You have successful sell your condo.");
                                        condo[sellRow - 1][sellCol - 1] = null;
                                    } else {
                                        System.out.println("You canceled your condo.");
                                    }
                                } else {
                                    System.out.println("Cannot Sell The Condo, Cause you don't have the ownership.");
                                }
                                break;

                            case 3: {
                                int manu;
                                do {
                                    System.out.println("----------Search Information---------------");
                                    System.out.println("-----------------------------");
                                    System.out.println("==> 1.Search By Owner's Name :");
                                    System.out.println("==> 2.Search By Floor :");
                                    System.out.println("==> 3.Exit");
                                    System.out.println("--------------------------");
                                    System.out.print("Choose Your Option From 1 - 3 :");
                                    manu = sc.nextInt();
                                    switch (manu) {
                                        case 1: {
                                            System.out.println("-----------Search By Owner's name--------");
                                            String s_value;
                                            boolean nameSelect = false;
                                            System.out.print("Please Owner name for search :");
                                            s_value = sc.next();
                                            for (int i = 0; i < floor; i++) {
                                                for (int j = 0; j < room; j++) {
                                                    if (s_value.equals(condo[i][j])) {
                                                        nameSelect = true;
                                                        System.out.println("Owner Name :" + condo[i][j] + " stay in room :" + (i + 1) + " Floor No :" + (j + 1));
                                                    }
                                                }
                                            }
                                            if (!nameSelect) {
                                                System.out.println("user :" + s_value + " Doesn't exist in our condo system..!");
                                            }
                                        }
                                        break;
                                        case 2: {
                                            System.out.println("-----------Search By Owner's name--------");
                                            int s_floor;
                                            System.out.print("Enter the floor you want to search :");
                                            s_floor = sc.nextInt();
                                            System.out.print("Floor :" + s_floor + " ");
                                            if (!(s_floor > 0) || s_floor <= floor) {
                                                for (int j = 0; j < floor; j++) {
                                                    System.out.print(condo[s_floor - 1][j] + " ");
                                                }
                                                System.out.println();
                                            } else {
                                                System.out.println("don't have floor");
                                            }

                                        }
                                        break;
                                        case 3: {
                                            System.out.println("You Left From Search Information.");
                                        }
                                        break;
                                        default: {
                                            System.out.println("Wrong Character Press Key To Try Again.");
                                        }
                                        break;
                                    }
                                } while (manu != 3);
                                break;
                            }
                            case 4: {
                                System.out.println("==> 4. Display Information.");
                                for (int i = 0; i < floor; i++) {
                                    System.out.print("Floor [" + (i + 1) + "] =>");
                                    for (int j = 0; j < room; j++) {
                                        System.out.print(" " + condo[i][j]);
                                    }
                                    System.out.println();
                                }
                            }
                            break;

                            case 5: {
                                System.exit(0);
                            }
                            break;
                            default: {
                                System.out.println("Wrong Character Press Key To Try Again.");
                            }
                            break;

                        }
                        System.out.println("Please Input 'yes' to continue....");
                        manuList = sc.next();
                    } while (manuList.equalsIgnoreCase("yes"));
                }
            }
        }
        while (con.equalsIgnoreCase("yes"));

    }
}
