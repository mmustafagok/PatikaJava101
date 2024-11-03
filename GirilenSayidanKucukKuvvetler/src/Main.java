import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        if (number <= 0) {
            System.out.println("Please enter a number greater than 0.");
            return;
        }

        System.out.println("Powers of 4:");
        int powerOf4 = 1; // 4^0
        // Print powers of 4
        for (int i = 0; powerOf4 <= number; i++) {
            System.out.printf("4^%d = %d%n", i, powerOf4);
            powerOf4 *= 4; // Calculate the next power
        }

        System.out.println("Powers of 5:");
        int powerOf5 = 1; // 5^0
        // Print powers of 5
        for (int i = 0; powerOf5 <= number; i++) {
            System.out.printf("5^%d = %d%n", i, powerOf5);
            powerOf5 *= 5; // Calculate the next power
        }
    }
}