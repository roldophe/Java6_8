package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("First element");
        linkedList.add("Second element");
        linkedList.addLast("Last element");
        System.out.println("LinkedList: " + linkedList);
        //printing first element
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Second element: " + linkedList.get(1));
        System.out.println("Last element: " + linkedList.getLast());
        System.out.println("Test: " + linkedList.clone());
    }
}
