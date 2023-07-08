package ArrayList.AddArrayList;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(){
            {
                add("Roldophe");
                add("Enzo");
                add("Luoiz");
                add("Daddy");
                add("Mommy");
            }
        };
        System.out.println("-------------------------------------------------------------");
        System.out.println("Unsorted NameList: "+nameList);
        System.out.println("-------------------------------------------------------------");

        //insert element at specified position
        nameList.add(1,"RADOM");
        System.out.println("Inserted NameList: "+nameList);

        System.out.println("-------------------------------------------------------------");
        nameList.sort(Comparator.naturalOrder());
        System.out.println("Sorted NameList: "+nameList);


        System.out.println("------------------------<<Integer>>--------------------------");
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(11);
        System.out.println("ArrayList: "+primeNumbers);
        System.out.println("-------------------------------------------------------------");
    }
}
