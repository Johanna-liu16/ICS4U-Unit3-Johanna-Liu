/*
* This program solves
* the Tower of Hanoi riddle.
*
* @author  Mr Coxall
* @version 1.0
* @since   2021-05-11
*/

import java.util.Scanner;

final class TowerOfHanoi {
    private TowerOfHanoi() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }


    static void hanoi(final int nOfDisks, final int startPeg,
                            final int endPeg, final int otherPeg) {
        // This function calculates where the disks should be placed in
        final int pegNumber = 6;
        if (nOfDisks == 1) {
            System.out.println("Move disk 1 from peg " + startPeg + " to peg "
                               + endPeg);
            return
        } else {
            hanoi(nOfDisks-1, startPeg, otherPeg, endPeg);
            System.out.println("Move disk " + nOfDisks + " from " + startPeg+ " to " + otherPeg);
            hanoi(nOfDisks-1, otherPeg, endPeg, startPeg);
        }
    }


    public static void main(final String[] args) {
        final int startPeg = 1;
        final int otherPeg = 2;
        final int endPeg = 3;

        System.out.println("Tower of Hanoi");

        // input
        Scanner userInput = new Scanner(System.in);
        System.out.print("\nHow many disks do you want?: ");

        try {
            int nOfDisks = userInput.nextInt();
            System.out.println();
            if (nOfDisks > 0) {
                // process
                hanoi(nOfDisks, startPeg, endPeg, otherPeg);
            } else {
                System.out.println("\nPlease enter a positive integer");
            }
        } catch (Exception ex) {
            System.err.print("\nThis is not an integer");
        }
    }
}