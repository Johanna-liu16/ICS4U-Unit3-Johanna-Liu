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
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    public static String reversedString(stringToReverse: string) {
        String theString = stringToReverse;
        if (theString.length() > 0) {
            final char firstChar = theString.charAt(0);
            theString = theString.substring(1, theString.length());
            theString = reverse_string(theString);
            theString += firstChar;
        }
        return theString
    }
    public static void main(String[] args) {
        public static final  aString = "recursion";

        System.out.println("");
        System.out.println("The original string is " + aString);
        reversedString = reverseString(aString);
        System.out.println("The reversed string is " + reversedString)
        
        System.out.println("\nDone.")
    }
}