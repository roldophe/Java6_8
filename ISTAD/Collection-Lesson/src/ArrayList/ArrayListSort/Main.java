package ArrayList.ArrayListSort;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(90);
        numbers.add(13);
        numbers.add(34);
        numbers.add(10);
        System.out.println("Unsorted ArrayList : "+numbers);

        numbers.sort(Comparator.naturalOrder());
        System.out.println("Sorted ArrayList: "+numbers);

        System.out.println("------------------------------");
        //Create an ArrayList
        ArrayList<String > languages = new ArrayList<>();

        //Add element to ArrayList
        languages.add("Java");
        languages.add("C#");
        languages.add("PHP");
        languages.add("Python");
        languages.add("Swift");
        System.out.println("Unsorted ArrayList: "+languages);

        //Sort the ArrayList in ascending order
        languages.sort(Comparator.naturalOrder());
        System.out.println("Sorted ArrayList: "+languages);

        //Sort the ArrayList in Reverse Order
        languages.sort(Comparator.reverseOrder());
        System.out.println("Sorted ArrayList(Reverse): "+languages);

    }
}
