package Array;

import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        String[] Cars = {"Camaro", "Covertte", "Tesla"};
        Cars[0] = "Mustang";
        System.out.println(Cars[0]);

        String[] name =  new String[3];
        name[0] = "RADOM";
        name[1] = "ROLDOPHE";
        name[2] = "KHOEM";
        System.out.println(Arrays.toString(name));
    }
}
