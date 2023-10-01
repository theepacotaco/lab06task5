import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 10 (inclusive)
        int randomNumber = random.nextInt(10) + 1;

        System.out.println("Welcome to the Random Number Guessing Game!");
        System.out.print("Guess the number between 1 and 10: ");

        if (scanner.hasNextInt()) {
            int userGuess = scanner.nextInt();

            if (userGuess >= 1 && userGuess <= 10) {
                System.out.println("The random number was: " + randomNumber);

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! Your guess is correct!");
                } else if (userGuess < randomNumber) {
                    System.out.println("Sorry, your guess is too low.");
                } else {
                    System.out.println("Sorry, your guess is too high.");
                }
            } else {
                System.out.println("Invalid guess. Please enter a number between 1 and 10.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid numeric guess.");
        }

        scanner.close();
    }
}
