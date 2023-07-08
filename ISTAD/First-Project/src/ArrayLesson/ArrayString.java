package ArrayLesson;

import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int columns = 2;
        int rows = 2;

        String[][] newArray = new String[columns][rows];
        int a,b;
        System.out.println("Enter a and b: ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        newArray[a][b] = scanner.next();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(" "+newArray[i][j]);
            }
            System.out.println();
        }
    }
}


