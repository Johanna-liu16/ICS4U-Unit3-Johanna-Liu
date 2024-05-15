
/*
 * This program uses oop
 *
 * @author  Johanna Liu
 * @version 1.0
 * @since   2024-04-24
 */

/**
 * This program uses stacks.
 */
import java.util.Scanner;

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

    public static void topHalf(int starNum) {
        String line = "";
        if (starNum > 1) {
            line = "*".repeat(starNum);
            System.out.print(line + "\n");
            topHalf(starNum - 1);
        } else if (starNum == 1) {
            line = "*";
            System.out.print(line);
        }
    }

    public static void bottomHalf(int starNum, int counter) {
        String line = "";
        if (counter == 1) {
            line = "*";
            System.out.println("\n" + line);
            bottomHalf(starNum, counter + 1);
        } else if (counter <= starNum) {
            line = "*".repeat(counter);
            System.out.print(line + "\n");
            bottomHalf(starNum, counter + 1);
        }
    }

    public static void main(String[] args) {

        System.out.println("Hourglass star pattern program.");

        // input
        Scanner userInput = new Scanner(System.in);
        System.out.print("\nEnter a number: ");

        int intInput = userInput.nextInt();

        if(intInput < 0) {
            System.out.println("Invalid Input");
        } else {
            int counter = 1;
            topHalf(intInput);
            bottomHalf(intInput, counter);
        }
        System.out.println("\nDone.");
    }
}