package ArrayListConstructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("ADMIN");
        list.add("ROLDOPHE");
        list.add(1,"RADOM");
        System.out.println("List: "+list);
        System.out.println("--------------------");
        for (Object o:list){
            System.out.println(o);
        }
        System.out.println("--------------------");
        System.out.println("Element of index1: "+list.get(1));
    }
}

