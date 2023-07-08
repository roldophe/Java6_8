package SetDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
public class treeSet {
    public static void main(String[] args) {
        TreeSet<String> nameList = new TreeSet<>(List.of("James","ROLDOPHE","Bruno"));
        nameList.add("BACKHOE");
        System.out.println("Here are the name list: "+nameList.descendingSet());
        new ArrayList<>(nameList).get(0);// get the first values
    }
}
