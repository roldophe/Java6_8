import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

record Person(int id, String name, String gender){}


public class Main {
    public static void main(String[] args) {
//        Person obj = new Person(101,"RADOM","Male");
//        System.out.println("Value of object is: "+obj);

        List<Person> records = new ArrayList<>(){{
            add(new Person(101,"Enzo","Male"));
            add(new Person(102,"Louiz","Male"));
            add(new Person(102,"ROLDOPHE","Male"));
            add(new Person(101,"Enzo","Male"));
        }};

        ////turn the list duplicate to unique
        HashSet<Person> unique = new HashSet<>(records);
        System.out.println("Here are the people: "+unique);

    }
}