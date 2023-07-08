package ArrayList.ArrayListDemoII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
//------------------------------------------------
        //add element
        nameList.add("RADOM");
        nameList.add("ROLDOPHE");
        nameList.add("Enzo");
        nameList.add("KHOEM");
        nameList.add("VICKY");
        System.out.println(nameList);

        //access element
        System.out.println("Access element:");
        String name= nameList.get(0);
        System.out.println("name at index0: "+name);
        System.out.println("Update element at index0:");
        //update or change element
        nameList.set(0,"Louis");
        System.out.println(nameList);

        System.out.println("remove element at index1:");
        //remove element
        nameList.remove(1);
        System.out.println(nameList);

//----------------------------------------------------

        //size(): returns the length of the arraylist.
        System.out.println("nameList.size(): "+nameList.size());

        //sort(): Sort the arraylist with the same element, size and capacity.
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        nameList.sort(stringComparator);
        System.out.println("After sort: "+nameList);

        //contains(): Search the arraylist for specified element
        // and returns a boolean result.
        boolean exist = nameList.contains("VICKY");
        System.out.println(exist);


        //isEmpty(): Checks if the arraylist is empty.
        System.out.println("isEmpty(): "+nameList.isEmpty());

        //indexOf(): Searches a specified element in an arraylist
        // and return the index of the element.(not found =-1 and search found = index)
        System.out.println("VICKY at index: " + nameList.indexOf("VICKY"));
        //---------------------------------------------------


//===========================================================
        //Iterate through  an Arraylist
        //for loop
        //for eachLoop
        System.out.println("=================================");
        System.out.println("Iterate through  an Arraylist");
        ArrayList<String> names = new ArrayList<>(){{
            add("ROLDPOHE");
            add("VICKY");
            add("California");
            add("Enzo");
            add("Kali");
            add("Bulu");
        }};
        //for eachLoop
        System.out.println("using for each");
        for (String n:  names){
            System.out.print("     "+n);
        }

        //for loop
        System.out.println("\nUsing for loop");
        for (int i=0; i<names.size(); i++){
            System.out.print("  "+names.get(i));
        }
        System.out.println("\n-----------------");
        names.forEach(System.out::println);


    }
}
