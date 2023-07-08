package SetDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

class Hobby{
    int id;
    String type;

    public Hobby(int id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,List<Hobby>> folds = new TreeMap<>(){{
            List<Hobby> hobbies = new ArrayList<>();
            hobbies.add(new Hobby(1,"Read Book"));
            hobbies.add(new Hobby(2,"Learning Backend"));
        }};
        System.out.println("All folks Hobbies");
        System.out.println(folds);

    }
}
