package ControlFlows;

import java.sql.SQLOutput;
import java.util.Scanner;

public class enhandSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========Menu=========");
        System.out.println("1. Full moon ");
        System.out.println("2. Fish swim in black sea");
        System.out.println("3. Other food ");
        System.out.println(" ");
        System.out.println("Choose your option: ");
        int option =  scanner.nextInt();
        String result = switch (option){
            case 1 -> {
                System.out.println("Hello Everyone! ");
                System.out.println("I am from case 1 ");
                yield "Fried Eggs";
            }
            case 2 -> "Chicken Nugget.";
            case 3 -> "Other food.";
            default -> "Invalid option.";
        };
        System.out.println("Here is the value of the result: "+result);
    }
}
