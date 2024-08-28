import java.sql.Date;
import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;
import java.text.NumberFormat;

public class HelloWorld {
    public static void main(String[] args) {
        String hello = "Hi Mom";
        // System.out.println(sayHi());
        Date now = new Date(0);
        // System.out.println(now);
        Point point1 = new Point(1, 1);
        String message = "Hello \"Moch\"";
        int[] numbers = { 1, 2, 3, 4, 5 };
        // System.out.println(Arrays.toString(numbers));s
        int[][] number = new int[2][3];
        number[0][0] = 1;
        // System.out.println(Arrays.deepToString(number));
        final float PI = 3.14F;
        double result = (double) 10 / (double) 3;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        String results = currency.format(1234567.891);
        // System.out.println(results);
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Name: ");
        // byte age = scanner.nextByte();
        // String name = scanner.nextLine().trim();
        // System.out.println("your are " + name);

        String[] fruits = { "Apple", "Mango", "Orange" };
        // for (String fruit : fruits)
        // System.out.println(fruit);

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_0000_000)
                break;
            System.out.println("Enter a value between 1000 and 1,000,000");
        }

        while (true) {
            System.out.println("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        while (true) {
            System.out.println("Period (Years): ");
            byte Years = scanner.nextByte();
            if (Years >= 1 && Years <= 30) {
                numberOfPayments = Years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        double mortage = principal * (monthlyInterest * Math.pow(1, monthlyInterest))
                / (Math.pow(1, monthlyInterest));
        String mortgageFormated = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage: " + mortgageFormated);
    }

    public static String sayHi() {
        return "Hi Mom!";
    }
}