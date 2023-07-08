package SetDemo.HashSetDemo;

import java.util.*;

/**
 * The important points about Java HashSet class are:
 * -HashSet stores the elements by using a mechanism called hashing
 * -HashSet contains unique elements only
 */
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>(List.of(2,3,6,7,1,2,3,4,5,6,1));
        HashSet<String> roleList = new HashSet<>(Arrays.asList("Farmer","Middleman","Admin","Farmer","Admin"));
        System.out.println("Numbers: "+numbers);
        System.out.println("RoleList: "+roleList);

        System.out.println("Printing all numbers using forEach: ");
        for (Integer integer: numbers)
        {
            System.out.print(" "+integer);
        }
        System.out.println();
        Iterator<Integer> iterator = numbers.iterator();
        System.out.println("Listing all number using iterators: ");
        while (iterator.hasNext()){
            System.out.print("  "+iterator.next());
        }
        System.out.println();


        //convert hashSet to arrayList
        ArrayList<Integer> integers= new ArrayList<>(numbers);
        System.out.println("Converted HashSet to Arrays: \n"+integers);
        System.out.println("First element: "+integers.get(0));

        //Converted HashSet to LinkedList
        System.out.println("Converted HashSet to LinkedList:");
        LinkedList<Integer> linkedList = new LinkedList<>(numbers);
        System.out.println("First element: "+linkedList.getFirst());
        System.out.println("Last element: "+linkedList.getLast());
    }
}
