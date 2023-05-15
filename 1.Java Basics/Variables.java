import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        // Read the string input from the user
        String userInput = scanner.nextLine();

        // Print the string entered by the user
        System.out.println("You entered: " + userInput);

        // Close the scanner to release resources
        scanner.close();
    }

}
