import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculate {
    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;
        System.out.println("Period (Year): ");
        byte years = scanner.nextByte();
        int numberOfPayment = years * MONTH_IN_YEAR;
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment)) / (Math.pow(1 + monthlyInterest, numberOfPayment) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage : " + mortgageFormatted);
    }
}
