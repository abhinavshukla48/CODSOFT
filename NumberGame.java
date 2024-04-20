import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attemptsLimit = 10;
        int rounds = 0;
        int score = 0;

        System.out.println("Welcome to Guess the Number Game!");

        do {
            int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;
            System.out.println("");
            System.out.println("Note: You'll be only getting 10 chances to guess the number in a single round.");
            System.out.println("\nRound " + (rounds + 1));
            System.out.println("Guess the number between " + minRange + " and " + maxRange);

            while (attempts < attemptsLimit) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == generatedNumber) {
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (guessedCorrectly) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                score += 100-((attempts-1)*10);
            } else {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + generatedNumber);
            }

            System.out.println("Your current score: " + score);
            System.out.print("Would you like to play again? (yes/no): ");
            String playAgain = scanner.next();
            if (playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("y") ) {
                rounds++;
            } else {
                break;
            }
        } while (true);

        System.out.println("Thanks for playing! Your final score: " + score);
        scanner.close();
    }
}
