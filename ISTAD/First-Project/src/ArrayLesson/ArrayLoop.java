package ArrayLesson;

import java.util.Arrays;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] values = {4,5,6,7,8,9};
        //for each
        for(int value: values){
            System.out.print(" "+value);
        }
        System.out.println();

        System.out.println("Here is the values: ");
        Arrays.stream(values).forEach(System.out::println);
    }
}
