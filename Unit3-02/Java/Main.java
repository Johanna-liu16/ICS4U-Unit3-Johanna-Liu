
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
    public static int findFactorial(int factorialAnswer) {
        if (factorialAnswer < 0) {
            return -1;
        } else {
            if (factorialAnswer == 0) {
                return 1;
            } else {
                return(factorialAnswer * findFactorial(factorialAnswer - 1));
            }
        }
    }

    /**
     * Get string.
     *
     * @param args
     *
     */
    public static void main(String[] args) {
        final int aNum = 5;
        final int bNum = 2;
        final int cNum = 7;

        System.out.println();
        final int factorialA = findFactorial(aNum);
        System.out.println("5! = " + factorialA);

        System.out.println();
        final int factorialB = findFactorial(bNum);
        System.out.println("2! = " + factorialB);

        System.out.println();
        final int factorialC = findFactorial(cNum);
        System.out.println("7! = " + factorialC);

        System.out.println("\nDone.");
    }
}
