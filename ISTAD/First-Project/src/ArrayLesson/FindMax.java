package ArrayLesson;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) throws InterruptedException {
        int[] values = {12, 3, 45, 6, 60, 99, 87, 65, 4};
        int max=values[0];
//        for (int i=1; i<values.length; i++) {
//            if(max<values[i])
//                max=values[i];
//        }

        for (int v: values) {
            if (max<v)
                max=v;
        }
        System.out.println("Max: "+max);

        System.out.print("Even numbers: ");
        for (int v : values){
            if (v%2==0){
                Thread.sleep(500);
                System.out.print(" "+v);
            }
        }
        System.out.println();
        System.out.println("After sorting : ");
        int temp=0;
        for (int i=0; i<values.length; i++){
            for (int j=i+1; j<values.length; j++){
                if (values[i]<values[j]){
                    temp =values[i];
                    values[i] =values[j];
                    values[j] =temp;
                }

            }
        }
        System.out.println(Arrays.toString(values));
        System.out.println("After sorting : ");
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
    }
}
