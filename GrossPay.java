import java.util.Scanner;

public class GrossPay {

    private static final int EMPLOYEE_COUNT = 3;
    private static final double REGULAR_HOURS = 40.0;
    private static final double OVERTIME_MULTIPLIER = 1.5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= EMPLOYEE_COUNT; i++) {
            System.out.printf("%nEmployee %d%n", i);

            System.out.print("Enter hours worked last week: ");
            double hours = input.nextDouble();

            System.out.print("Enter hourly rate: ");
            double rate = input.nextDouble();

            double grossPay;
            if (hours <= REGULAR_HOURS) {
                grossPay = hours * rate;
            } else {
                double overtimeHours = hours - REGULAR_HOURS;
                grossPay = REGULAR_HOURS * rate
                        + overtimeHours * rate * OVERTIME_MULTIPLIER;
            }

            System.out.printf("Employee %d gross pay: $%,.2f%n", i, grossPay);
        }

        input.close();
    }
}