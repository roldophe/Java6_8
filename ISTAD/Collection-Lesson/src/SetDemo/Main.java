package SetDemo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>(List.of(1,3,7,2,3,4,5,6,7,8));
//        numbers = new HashSet<>(){
//            {
//                add(10);
//                add(34);
//                add(56);
//            }
//        };
        HashSet<String> roleList = new HashSet<>(Arrays.asList("ROL","DOPHE","ROL","ASD"));
        //numbers.clear();
        System.out.println("Numbers are: "+numbers);
        System.out.println("Roles are: "+roleList);
        System.out.println("Printing all number using forEach: ");
        for (Integer integer: numbers){
            System.out.print(" "+integer);
        }
        System.out.println();
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.print("  "+iterator.next());
        }
        System.out.println();
        ArrayList<Integer> listNumber = new ArrayList<>(numbers);
        listNumber.add(90);
        listNumber.add(1);
        listNumber.add(4);
        System.out.println("First element is: "+listNumber.get(0));
    }
}
