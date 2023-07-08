package com.Radom.java.OnlineCourse.Basic.Function;

import java.util.Objects;
import java.util.Scanner;

public class CMS {
    static int MaxFloor = 50;
    static int MaxRoom = 50;
    static void setManu() {
        System.out.println("***************Welcome to Condo Management System***************");
        System.out.println("            1. Buy the condo                                    ");
        System.out.println("            2. Sell the condo                                   ");
        System.out.println("            3. Show all the condo information                   ");
        System.out.println("            4. Search  condo information                        ");
        System.out.println("            5. Exit                                             ");
        System.out.println("*****************************************************************");
        System.out.print("Please choose a valid option: ");
    }
    public static void setFloor(int floor){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter number of floor: ");
            floor = scanner.nextInt();
            if (floor > 0 && floor <= MaxFloor)
                break;
            System.out.println("Invalid! Please enter a value between 1 and " + MaxFloor + ". ");
        }
    }
    public static void setRoom(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter number of room: ");
            int room = scanner.nextInt();
            if (room>0 && room<=MaxRoom)
                break;
            System.out.println("Invalid! Please enter a value between 1 and " + MaxRoom + ". ");
        }
    }
    static void setCondo() {

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floor = 0;
        int room = 0;
        String[][] condo = new String[MaxFloor][MaxRoom];
        System.out.println("********Setting Up The Condo********");
//        do {
//            setManu();
//            option = scanner.nextByte();
//            switch (option){
//                case 1: {
//                    System.out.println("=========== Condo for sale ===========");
//                }break;
//                case 2: {
//                    System.out.println("=========== Sell for sale ===========");
//                }break;
//                case 5: {
//                    System.out.println("Exiting program...!");
//                }break;
//                default:
//                    System.out.println("Error! Choose a valid manu option.");
//            }
//        }while (option!=5);

    }

}
