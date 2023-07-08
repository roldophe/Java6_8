package ArrayList.ArraylistPractice;

import java.util.Scanner;

public class Utils {
    public static String getString(String label){
        System.out.print(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public static String getStringLn(String label){
        System.out.print(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static float getFloat(String label){
        String text = getString(label);
        return Float.parseFloat(text);
    }
    public static double getDouble(String label){
        String text = getString(label);
        return Double.parseDouble(text);
    }

    public static int getInt(String label){
        String text= getString(label);
        return Integer.parseInt(text);
    }
}
