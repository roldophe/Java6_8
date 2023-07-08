package ArrayList.AddArrayList;

import java.util.ArrayList;

public class Insert {
    public static void main(String[] args) {
        ArrayList<String> languages1 = new ArrayList<>();
        languages1.add("Java");
        languages1.add("Python");
        System.out.println("ArrayList 1: "+languages1);
        System.out.println("-----------------------------------");

        //Creating another arrayList
        ArrayList<String> languages2 = new ArrayList<>();
        languages2.add("JavaScript");
        languages2.add("C++");
        languages2.add("Python");
        System.out.println("ArrayList 2: "+languages2);

        //Add elements from languages1 to languages2
        languages2.addAll(0,languages1);
        System.out.println("Updated ArrayList2: "+languages2);
    }
}
