package PrintsAndScanner;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your name: ");
        String username = scanner.next();
        System.out.println("Please input your password: ");
        int password = scanner.nextInt();
        System.out.println("Here is the value you have input: ");
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);

    }
}
