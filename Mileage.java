import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        System.out.print("Enter miles driven (-1 to quit): ");
        int miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();

            if (miles < 0 || gallons <= 0) {
                System.out.println("Invalid input: miles cannot be negative and gallons must be positive.");
            } else {
                // cast one operand so the division is floating-point, not integer
                double tripMpg = (double) miles / gallons;
                System.out.printf("MPG this trip: %.2f%n", tripMpg);

                totalMiles += miles;
                totalGallons += gallons;

                double combinedMpg = (double) totalMiles / totalGallons;
                System.out.printf("Total MPG: %.2f%n", combinedMpg);
            }

            System.out.println();
            System.out.print("Enter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }

        System.out.println("Program ended.");
    }
}