package Testing;

import java.text.DecimalFormat;

public class TableExample {
        public static void main(String[] args) {
            double value = 1234.56789;
            DecimalFormat df = new DecimalFormat("#,###.##");
            String formattedValue = df.format(value);
            System.out.println("Formatted value: " + formattedValue);
        }

}
