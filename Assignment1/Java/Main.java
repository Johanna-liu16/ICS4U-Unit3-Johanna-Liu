
/*
 * This program uses oop
 *
 * @author  Johanna Liu
 * @version 1.0
 * @since   2024-04-24
 */

 import java.util.Random;
 import java.util.Scanner;

/**
 * This program uses stacks.
 */
final class Main {

    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     *
     * @throws IllegalStateException if this is ever called
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Reverse the string.
     *
     * @param stringToReverse
     *
     * @return string
     *
     */

    public static void main(String[] args) {
        final String[] options = {"Rock", "Paper", "Scissors"};

        Random rand = new Random();
        int randNum = rand.nextInt(2);

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Rock, Paper, or Scissors (1-3): ");
        final int userInput = scanner.nextInt() -1;

        System.out.println("The computer choose  " + options[randNum]);

        if (userInput == randNum) {
            System.out.println("Draw!");
        } else if (
            (userInput == 0 && randNum == 2) ||
            (userInput == 1 && randNum == 0) ||
            (userInput == 2 && randNum == 1)
        ) {
            System.out.println("You Win!!");
        } else {
            System.out.println("You Lose.");
        }

        System.out.println("\nDone.");
    }
}
