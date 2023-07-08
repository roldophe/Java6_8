package CollectionDemo;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        //Add element
        nameList.add("ASD");
        nameList.add("RODOLPHE");
        nameList.add("VANDA");
        nameList.add("James");
        nameList.add("Thia");
        nameList.add("Enzo");
        System.out.println("Before update... ");
        System.out.println(nameList);
//
//        //Access element at index
//    //    String name1=nameList.get(1);
//    //    System.out.println("Name1: "+name1);
//
//        //update element
//        nameList.set(3,"Gosling");
//        System.out.println("After update...");
//        System.out.println(nameList);
//
//        //remove element
//        nameList.remove(0);
//        System.out.println("After remove...");
//        System.out.println(nameList);
//
//        //sort element
//        Comparator<String> CmpString = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        };
//        nameList.sort(CmpString);
//        System.out.println("After sort...");
//        System.out.println(nameList);
        //Search the arrayList for the specified element and return boolean(true or false)
        boolean exist = nameList.contains("Thia");
        System.out.println(exist);
        //Checks if the arrayList is empty. (return boolean)
        System.out.println(nameList.isEmpty());

        //Searches a specified element in an arrayList and return the index of element
        System.out.println(nameList.indexOf("Thia"));

        System.out.println("Printing with loop");
        for (int i=0; i<nameList.size(); i++){
            System.out.print("index["+(i)+"]: "+nameList.get(i)+"  ");
        }
        System.out.println();
        for (String element:
             nameList) {
            System.out.print(element+"  ");
        }
        System.out.println();
        nameList.forEach(System.out::println);
    }
}
