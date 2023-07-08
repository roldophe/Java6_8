package StreamLession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12, 36, 55, 24, 64, 3));
        /*
        - forEach
        - filter
        - map
        - reduce
         */
        System.out.println("Here are all the numbers: ");
        numbers.stream().forEach(e -> System.out.print(" " + e));
        System.out.println();
        numbers.stream().filter(e -> (e % 2 == 0))
                .forEach(e -> System.out.print(" " + e));
        System.out.println();
        System.out.println("Original numbers: " + numbers);
        System.out.println();
        List<Integer> updateScore = numbers.stream().map(e -> e + 10).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Updated to score: " + updateScore);
    }
}
