package SetDemo.HashSetDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class ArrayListToHashSet {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("ROLDOPHE","ENZO","RADOM","KHOEM","ENZO","LUOIZ","ROLDOPHE"));
        System.out.println("Unconverted nameList: "+nameList);

        HashSet<String> uniqueNameList = new HashSet<>(nameList);
        System.out.println("Converted nameList: "+uniqueNameList);

        //hashSetName.sort(Comparator.naturalOrder()); we cannot sort HashSet
        //So, you should be converted HashSet(hashSetName) to ArrayList

        ArrayList<String> arrayListSort = new ArrayList<>(uniqueNameList);
        arrayListSort.sort(Comparator.naturalOrder());
        System.out.println("Sorted nameList: "+arrayListSort);
    }
}
