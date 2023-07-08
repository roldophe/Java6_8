package StackDemo;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();
        //Stack<Integer> stacks= new Stack<>();

        /**
         * To add an element to the top of the stack,
         * we use the push() method.
         */
        animal.push("Dog");
        animal.push("Horse");
        animal.push("Cat");
        animal.push("Elephant");
        animal.push("Monkey");
        animal.push("Shark");
        System.out.println("Stack: "+animal);

        /**
         * To remove an element from the top of the stack,
         * we use the pop() method.
         */
        String element =  animal.pop();
        System.out.println("Removed element: "+element);
        System.out.println("New Stack: "+animal);

        /**
         * To return an object from the top of the stack,
         * we use the peek() method.
         */
        String top = animal.peek();
        System.out.println("Element at the top: "+top);

        /**
         * To search an element in the stack,
         * we use the search() method.
         * It returns the position of the element
         * from the top of the stack
         */
        int position =  animal.search("Monkey");
        System.out.println("Position of horse: "+position);
        System.out.println("Index 4: "+animal.get(4));

        /**
         * To check whether a stack is empty or not,
         * we use the empty() method.
         */
        System.out.println("Is the stack empty? "+animal.isEmpty());
        animal.removeAll(animal);
        System.out.println("Removed all element: "+animal);
        System.out.println("Is the stack empty? "+animal.isEmpty());
    }
}
