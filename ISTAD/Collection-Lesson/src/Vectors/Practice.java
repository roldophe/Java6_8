package Vectors;

import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Vector;

public class Practice {
    public static void main(String[] args) {
        Vector<String> mammals = new Vector<>();
        //Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");
        mammals.add("Cat");
        //Using index number
        mammals.add(1,"Cow");
        System.out.println("Mammals:"+mammals);

        //Using addAll()
        Vector<String> animal = new Vector<>();
        animal.add("Pig");
        animal.addAll(mammals);
        //Using index number
        animal.add(2,"Elephant");
        System.out.println("New vector: "+animal);

        //Using get()
        System.out.println("Element at index 2: "+animal.get(2));

        //Using iterator()
        Iterator<String> iterator = animal.iterator();
        System.out.println("Vector: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(", ");
        }
        System.out.print("\nsize: "+animal.size());
        System.out.println("\n_______________________________");
        //Using remove()
        String  element = animal.remove(1);
        System.out.println("Removed element: "+element);
        System.out.println("New vector: "+ animal+"\nsize: "+animal.size());
        //Using clear()
        animal.clear();
        System.out.println("vector after clear(): "+animal);
        System.out.println("size: "+animal.size());
    }
}
