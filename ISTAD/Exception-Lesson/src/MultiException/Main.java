package MultiException;

public class Main {
    public static void main(String[] args) {
        try {
            int[] array = new int[10];
            array[10] = 30 / 0;
            System.out.println("Result: " + array[9]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
