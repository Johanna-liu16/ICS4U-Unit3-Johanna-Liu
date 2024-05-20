/*
* This program generates 250 random numbers in an array
* and allows the user to search the array for a number.
*
* @author  Mr Coxall
* @version 0.5
* @since   2020-09-01
*/

import java.util.Random;
import java.util.Arrays;

final class MergeSort {
  private MergeSort() {
    // Prevent instantiation
    // Optional: throw an exception e.g. AssertionError
    // if this ever *is* called
    throw new IllegalStateException("Cannot be instantiated");
  }


  /**
  * The max number for array.
  */
  public static final int MAX = 99;
  /**
  * The number of elements in the array.
  */
  public static final int ARRAY_SIZE = 5;

  /**
  * Function finds the index of a number, using Binary Search recursively.
  *
  * @param userArray
  * @param highIndex
  * @return binarySearch
  */
    public static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }

        final int middle = array.length / 2;
        final int[] left = Arrays.copyOfRange(array, 0, middle);
        final int[] right = Arrays.copyOfRange(array, middle, array.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    /**
     * This is the merge algorithm.
     *
     * @param left left side of array
     * @param right right side of array
     * @return result
     */
    public static int[] merge(final int[] left, final int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        final int[] result = new int[left.length + right.length];

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                result[leftIndex + rightIndex] = left[leftIndex];
                leftIndex++;
            } else {
                result[leftIndex + rightIndex] = right[rightIndex];
                rightIndex++;
            }
        }
        // Copy remaining elements from left or right array if any
        while (leftIndex < left.length) {
            result[leftIndex + rightIndex] = left[leftIndex];
            leftIndex++;
        }
        while (rightIndex < right.length) {
            result[leftIndex + rightIndex] = right[rightIndex];
            rightIndex++;
        }

        return result;
    }

  public static void main(final String[] args) {
    System.out.println("Merge Sort Program\n");
    // Initializing the random class
    Random randNumber = new Random();

    // Initializing array of numbers
    int[] randomNumberArray = new int[ARRAY_SIZE];

    // Adding numbers to the array
    for (int counter = 0; counter < randomNumberArray.length; counter++) {
      randomNumberArray[counter] = randNumber.nextInt(MAX) + 1;
    }

    System.out.print("Random list of numbers:\n");
    for (int element: randomNumberArray) {
      String padded = String.format("%2d", element);
      System.out.print(padded + ", ");
    }

    System.out.print("\n\nSorted list of numbers:\n");
    int[] sortedArray = mergeSort(randomNumberArray);
    for (int element: sortedArray) {
      String padded = String.format("%2d", element);
      System.out.print(padded + ", ");
    }

    System.out.print("\nDone.\n");
    }
  }