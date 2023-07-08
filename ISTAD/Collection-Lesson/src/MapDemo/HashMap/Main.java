package MapDemo.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> collections  = new HashMap<>(){
            {
                put("jenny","Study at Korea, work at BP.");
                put("asd","Study at Korea, work at BP.");
            }
        };
        collections.put("Dom","Study at RUPP. Major in IT");
        collections.put("Deth","Student at RUPP. Major in CS");

        System.out.println("Here is information about DOM");
        System.out.println(collections.get("Dom"));
        //printing all string..
    //    System.out.println(collections);

        //print only the keys
        ArrayList<String> allKey = new ArrayList<>(collections.keySet());
        System.out.println("All keys are: ");
        for (String key: allKey){
            System.out.print("  "+key);
        }
        System.out.println();

        for (Map.Entry<String, String> entry: collections.entrySet()){
            System.out.println("key is: " + entry.getKey()+"   values is: "+entry.getValue());
        }
        collections.keySet().forEach(System.out::println);
        collections.values().forEach(System.out::println);
        collections.forEach((key,values)-> System.out.println(key+" "+values));
    }
}
