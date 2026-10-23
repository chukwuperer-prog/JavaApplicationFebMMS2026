import java.util.Scanner;

public class SalesCommission {

    // Fixed weekly pay and commission rate
    private static final double WEEKLY_SALARY = 200.00;
    private static final double COMMISSION_RATE = 0.09;

    // Item prices (index 0 = item 1, index 1 = item 2, ...)
    private static final double[] ITEM_PRICES = {239.99, 129.75, 99.95, 350.89};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grossSales = 0.0;

        System.out.println("Items:");
        for (int i = 0; i < ITEM_PRICES.length; i++) {
            System.out.printf("  Item %d: $%.2f%n", i + 1, ITEM_PRICES[i]);
        }

        System.out.print("\nEnter item number sold (1-" + ITEM_PRICES.length
                + "), or -1 to finish: ");
        int itemNumber = input.nextInt();

        // Sentinel-controlled loop: no limit on the number of items sold
        while (itemNumber != -1) {
            if (itemNumber < 1 || itemNumber > ITEM_PRICES.length) {
                System.out.println("Invalid item number. Try again.");
            } else {
                System.out.print("Enter quantity sold: ");
                int quantity = input.nextInt();

                if (quantity < 0) {
                    System.out.println("Quantity cannot be negative. Try again.");
                } else {
                    grossSales += ITEM_PRICES[itemNumber - 1] * quantity;
                }
            }

            System.out.print("\nEnter item number sold (1-" + ITEM_PRICES.length
                    + "), or -1 to finish: ");
            itemNumber = input.nextInt();
        }

        double earnings = WEEKLY_SALARY + COMMISSION_RATE * grossSales;

        System.out.printf("%nGross sales for the week: $%,.2f%n", grossSales);
        System.out.printf("Weekly earnings:            $%,.2f%n", earnings);

        input.close();
    }
}