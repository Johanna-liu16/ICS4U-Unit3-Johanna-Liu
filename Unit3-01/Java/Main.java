
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
    public static String reversedString(String stringToReverse) {
        String theString = stringToReverse;
        if (theString.length() > 0) {
            final char firstChar = theString.charAt(0);
            theString = theString.substring(1, theString.length());
            theString = reversedString(theString);
            theString += firstChar;
        }
        return theString;
    }

    /**
     * Get string.
     *
     * @param args
     *
     */
    public static void main(String[] args) {
        final String aString = "recursion";

        final String original = "The original string is ";
        final String finalString = "The reversed string is ";

        System.out.println();
        System.out.println(original + aString);
        final String reverseString = reversedString(aString);
        System.out.println(finalString + reverseString);

        System.out.println("\nDone.");
    }
}
