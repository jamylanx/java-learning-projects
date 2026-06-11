import java.util.Scanner;

public class TOTAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the numbers
        int[] numbers = new int[n];

        // Input numbers from the user
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the total
        int total = 0;
        for (int num : numbers) {
            total += num;
        }

        // Calculate the average
        double average = (double) total / n;

        // Display the total and average
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
