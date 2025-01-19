import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

        // Print the left triangle pattern
        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
