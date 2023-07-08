package Vectors.Review;
import java.util.Enumeration;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> stringList = new Vector<>(){{
            add("First");
            add("Second");
        }};
        stringList.add("Hello");
        stringList.add("Messages");
        System.out.println("\n------------First Item------------");
        for (String element: stringList){
            System.out.print(" "+element);
        }
        System.out.println("\n------------Second Item------------");
        for (int i=0; i<stringList.size(); i++){
            System.out.print(" "+stringList.get(i));
        }
        System.out.println("\n------------Third Item------------");
        Enumeration<String> enumeration = stringList.elements();
        while (enumeration.hasMoreElements()){
            System.out.print(" "+enumeration.nextElement());
        }
        System.out.println();
    }
}
