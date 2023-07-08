package ArrayList.ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //remember that collection framework works with classes
        //Wrapper class or your custom Class...

        //initialized arraylist
        List<String> namelist = Collections.unmodifiableList(new ArrayList<>() {{
            for (int i = 0; i < 4; i++)
                add("Name[" + (i + 1) + "]: " + "ReachNa");
            add("RANDOM");
            add("Rodolphe");
            add("james");
            add("Eno");
        }});


        System.out.println("All name list: " + namelist);
        List<String> names = new ArrayList<>();
        names.add("RANDOM");
        names.add("ASD");
        names.add("VD");
        System.out.println("First name is: " + names.get(0));
        System.out.println("Second name is: " + names.get(1));
        System.out.println("Third name is : " + names.get(2));
        System.out.println("All name: " + names);


        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(123, 23, 34, 23, 54, 12));
        intList = new ArrayList<>(Arrays.asList(3, 12, 23, 23, 54, 1));
        List<Integer> allNums = new ArrayList<>(intList);
        //allNums.addAll(intList);

        System.out.println("=================<<Using for loop>>==================");
        for (int i = 0; i < names.size(); i++) {
            System.out.print("    " + names.get(i));
        }
        System.out.println();

        System.out.println("===================Using forEach=====================");
        for (String name : names) {
            System.out.print("   " + name);
        }
        System.out.println();
        System.out.println("================================");
        names.forEach(System.out::println);
    }
}
