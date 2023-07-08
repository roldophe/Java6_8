package Vectors;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Vector<String> stringList = new Vector<>(){
            {
                add("First");
                add("Second");
            }
        };
        stringList.add("Hello");
        stringList.add("Message");

        for (String  element: stringList){
            System.out.println(" "+element);
        }

        Enumeration<String> enumeration = stringList.elements();
        while (enumeration.hasMoreElements()){
            System.out.print(" "+enumeration.nextElement());
        }


        System.out.println("\n\n================LinkedList===============");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("First element");
        linkedList.addLast("Last element");
        linkedList.add("Second element");
        linkedList.addFirst("I am first now!");

        //linkedList.clear();
        System.out.println("Second element is: "+linkedList.get(1));
        System.out.println("===============Print all element=============");
        for (String element: linkedList)
            System.out.println(" "+element);

    }
}
