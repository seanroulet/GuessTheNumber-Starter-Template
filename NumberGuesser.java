import java.util.Random;
import java.util.Scanner;

/**
 * A simple number guessing game.
 * The student's task is to implement the game logic.
 */
public class NumberGuesser {

    public static void main(String[] args) {
        // 1. Setup: Create Scanner and Random objects, and generate the number.
        Scanner inputScanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        // Generates a random number between 0 and 99. Adding 1 makes it 1-100.
        int numberToGuess = randomGenerator.nextInt(100) + 1;

        // 2. Variable Declaration: These will store the user's guess, the count of tries,
        //    and a flag to know when the game is over.
        int userGuess = 0; // Initialized to a value that cannot be the correct answer.
        int guessCount = 0;
        boolean hasGuessedCorrectly = false;

        // 3. Game Introduction: Print a welcome message to the player.
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        // 4. Game Loop: This is where the core logic will go.
        //    The loop should continue as long as 'hasGuessedCorrectly' is false.
        while (!hasGuessedCorrectly) {
            // TODO: Prompt the user to enter their guess.
            // Example: System.out.print("Enter your guess: ");


            // TODO: Read the integer guess from the user using the scanner.
            // Hint: userGuess = inputScanner.nextInt();


            // TODO: Increment the guess counter.


            // TODO: Use an if/else-if/else block to check the guess.
            // - If userGuess is greater than numberToGuess, print "Too high, try again."
            // - If userGuess is less than numberToGuess, print "Too low, try again."
            // - If they are equal, print the success message and set 'hasGuessedCorrectly' to true.
            //   The success message should be: "Correct! You found the number in [X] tries!"
            //   (Replace [X] with the value of guessCount).

        }

        // 5. Cleanup: It's good practice to close the scanner when you're done.
        inputScanner.close();
    }
}
