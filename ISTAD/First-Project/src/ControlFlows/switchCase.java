package ControlFlows;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========Menu=========");
        System.out.println("1. Full moon ");
        System.out.println("2. Fish swim in black sea");
        System.out.println("3. Chicken nugget ");
        System.out.println(" ");
        System.out.println("Choose your option: ");
        int option = scanner.nextInt();

        switch(option){
            case 1 : {
                int value =10;
                System.out.println("Your Option: Fried eng");
                break;
            }
            case 2 :
                //value = 12; // if you want to use value you shouldn't use break;
                System.out.println("Your Option: Fish with sauce");
                break;
            case 3 :
                System.out.println("Your Option:  Plov Man");
                break;
            default:
                System.out.println("Invalid Option! Choose again!!");
        }

    }
}
