import java.util.Scanner;

public class RoundingNumbers {

    // a) Rounds number to the nearest integer
    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }

    // b) Rounds number to the nearest tenth
    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    // c) Rounds number to the nearest hundredth
    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    // d) Rounds number to the nearest thousandth
    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (or 0 to quit): ");
        double number = input.nextDouble();

        while (number != 0) {
            System.out.printf("%nOriginal value:        %f%n", number);
            System.out.printf("Rounded to integer:    %.0f%n", roundToInteger(number));
            System.out.printf("Rounded to tenths:     %.1f%n", roundToTenths(number));
            System.out.printf("Rounded to hundredths: %.2f%n", roundToHundredths(number));
            System.out.printf("Rounded to thousandths:%.3f%n", roundToThousandths(number));

            System.out.print("%nEnter a number (or 0 to quit): ".replace("%n", "\n"));
            number = input.nextDouble();
        }

        input.close();
    }
}