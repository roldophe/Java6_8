package LambdaReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LambdaWithCollection {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>((Arrays.asList(12, 34, 56, 23, 65, 23)));
        System.out.println("Before sorting : " + al);
        //using lambda expression in place of comparator object
        Collections.sort(al, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
        System.out.println("After sorting: " + al);

    }
}
