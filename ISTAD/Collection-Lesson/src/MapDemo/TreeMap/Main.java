package MapDemo.TreeMap;

import java.util.*;

class Hobby {
    private int id;
    private String type;

    public Hobby() {
    }
    public Hobby(int id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "id: " + id + ", type:" + type;
    }
}

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Set<Hobby>> folks = new TreeMap<>() {
            {
                put("dom", new HashSet<>(Arrays.asList(new Hobby(1, "Solo travel"), new Hobby(2, "Solo travel"))));
                put("cheak", new HashSet<>(Arrays.asList(new Hobby(1, "Collaborating on open source projects"), new Hobby(2, "Reading"))));
                put("deth", new HashSet<>(Arrays.asList(new Hobby(1, "Solo travel"), new Hobby(2, "Sports and Exercise"))));
            }
        };
        // System.out.println("All folks hobby: " + folks);
        //initial hobbies -> hobbies must be all unique(set)
        //Map.Entry-> keys and values
        System.out.println("---------------------------------------<<Keys And Values>>---------------------------------");
        for (Map.Entry<String, Set<Hobby>> entry : folks.entrySet())
            System.out.println("Key: " + entry.getKey() + "   Value: " + entry.getValue());
        //print only key -> keys
        System.out.println("\n--------------------------------------------<<Keys>>--------------------------------------");
        ArrayList<String> allKeys = new ArrayList<>(folks.keySet());
        System.out.println("All keys  : " + allKeys);
        //print only value -> values
        System.out.println("-------------------------------------------<<Values>>--------------------------------------");
        ArrayList<Set<Hobby>> allValues = new ArrayList<>(folks.values());
        System.out.println("All values: ");
        for (Set<Hobby> values : allValues){
            for (Hobby hobby: values){
                System.out.println(hobby);
            }
        }
       //     System.out.println("            " + values);
        // System.out.println("All values: " + allValues);
    }
}
