import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the harmonic series
        double harmonicSum = 0.0;
        for (int i = 1; i <= number; i++) {
            harmonicSum += 1.0 / i;
        }

        // Display the result
        System.out.printf("The harmonic series sum for %d is: %.4f%n", number, harmonicSum);
    }
}
