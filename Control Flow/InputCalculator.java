import java.util.Scanner;

public class InputCalculator {
    // Method to input numbers and print sum and average
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long average = 0;

        while (true) {
            System.out.println("Enter a number or a non-numeric string to exit:");
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);
                sum += number;
                count++;
                average = Math.round((double) sum / count);
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        scanner.close();

        if (count > 0) {
            System.out.println("SUM = " + sum + " AVG = " + average);
        } else {
            System.out.println("No numbers entered.");
        }
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}