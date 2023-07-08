package MapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<String, String> collections = new HashMap<>(){{
            put("jenny","Study at Korea, work at BP");
            put("June","Study at Korea, work at AB");
        }};

        collections.put("DOM","Study at Rupp.Major in CS");
        collections.put("DSA","Study at Rupp, Major in IT");
//        System.out.println("Here is information about DOM");
//        System.out.println(collections.get("DOM"));

 //       System.out.println(collections);

        List<String> allKeys = new ArrayList<>(collections.keySet());
        System.out.println("All keys are: ");
        for (String key: allKeys){
            System.out.print(" "+key);
        }
        System.out.println();
        List<String> allValues = new ArrayList<>(collections.values());
        System.out.println(allValues);

        //key/value pair -> entry
        for (Map.Entry<String,String>entry:collections.entrySet()){
            System.out.println("Key is: "+entry.getKey()+"  values is: "+entry.getValue());
        }

        collections.keySet().forEach(System.out::println);
        collections.values().forEach(System.out::println);
        collections.forEach((key, value) -> System.out.println(key + " " + value));

    }
}
