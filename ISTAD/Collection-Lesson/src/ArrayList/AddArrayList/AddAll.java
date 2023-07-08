package ArrayList.AddArrayList;

import java.util.ArrayList;
import java.util.Comparator;

public class AddAll {
    public static void main(String[] args) {
        //Create an arrayList
        ArrayList<String> languages = new ArrayList<>();
        languages.add("JAVA");
        languages.add("C#");
        languages.add("C++");
        languages.add("Python");
        languages.add("Swift");
        System.out.println("Languages: "+languages);

        //create another arraylist
        ArrayList<String> programmingLang= new ArrayList<>();
        //add all elements from languages to programmingLanguages
        programmingLang.addAll(languages);
        System.out.println("Programming languages: "+programmingLang);
        programmingLang.sort(Comparator.naturalOrder());
        System.out.println("Sorted languages: "+programmingLang);
    }
}
