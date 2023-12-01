import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        System.out.println("Welcome to the Guess the Number game!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Generate a random number within the specified range
            int targetNumber = new Random().nextInt(100) + 1;

            // Set the maximum number of attempts
            int maxAttempts = 10;
            int attempts = 0;

            System.out.println("I've selected a number between 1 and 100. Can you guess it?");

            while (attempts < maxAttempts) {
                // Prompt the user to enter their guess
                System.out.print("Your guess: ");
                int userGuess = scanner.nextInt();

                // Compare the user guess with the generated number
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + targetNumber +
                            " in " + (attempts + 1) + " attempts.");
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attempts++;
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " +
                        targetNumber + ".");
            }

            // the user if they want to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        scanner.close();
    }
}
