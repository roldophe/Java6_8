package ArrayLesson;

public class twoDimension {
    public static void main(String[] args) {
        //int[][] values = new int[3][5];
        //3rows 3columns
        int[][] values = {  {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9},
                            {7, 8, 9}
        };
        // For each
        for (int[] elements : values) {
            for (int e : elements) {
                System.out.print(" " + e);
            }
            System.out.println();
        }
        System.out.println("For loop");
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++)
                System.out.print(" " + values[i][j]);
            System.out.println();
        }

        System.out.println("For loop number");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(" " + values[i][j]);
            System.out.println();
        }
    }
}
