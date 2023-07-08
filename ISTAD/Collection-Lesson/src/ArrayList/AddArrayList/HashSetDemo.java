package ArrayList.AddArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //create a hashset of String type
        HashSet<String> set = new HashSet<>();

        //add elements to hashset
        set.add("JAVA");
        set.add("Python");
        set.add("C++");
        System.out.println("HashSet: "+set);
        //create an arrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("HTML");
        list.add("PHP");
        list.add("ReactJS");
        System.out.println("Initial Arraylist: "+list);

        //Add all elements from hashset to arrayList
        list.addAll(set);
        System.out.println("Updated ArrayList: "+list);
        //clear() vs removeAll()
        //list.clear();
        System.out.println("After clear: "+list);
        list.removeAll(list);
        System.out.println("After remove all: "+list);
    }
}
