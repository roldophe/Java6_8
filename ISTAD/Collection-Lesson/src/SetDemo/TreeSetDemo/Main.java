package SetDemo.TreeSetDemo;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> nameList = new TreeSet<>(
                Arrays.asList
                        ("James","RADOM","ROLDOPHE","ENZO","JAMES","RADOM")
        );
        System.out.println("Here are the nameList(Ascending): "+nameList);
        System.out.println("Here are the nameList(Reverse): "+nameList.descendingSet());
    }
}
