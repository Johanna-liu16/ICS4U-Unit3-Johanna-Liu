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


    static void hanoi(final int nDisks, final int startRod,
                            final int endRod, final int otherRod) {
        // This function calculates where the disks should be placed in
        if (nDisks == 0) {
            return;
        } else {
            hanoi(nDisks-1, startRod, otherRod, endRod);
            System.out.println("Move disk " + nDisks + " from " + startRod+ " to " + endRod);
            hanoi(nDisks-1, otherRod, endRod, startRod);
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