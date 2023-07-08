package SetDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetDemo {
    public static void main(String[] args) {
        //get data from users
        ArrayList<String> categories = new ArrayList<>(
            List.of("Sport","Swimming ","Entertainment","News","Education","Sport")
            );
        HashSet<String> uniqueCategories = new HashSet<>(categories);
        System.out.println("All Categories now : "+uniqueCategories);
    }
}
