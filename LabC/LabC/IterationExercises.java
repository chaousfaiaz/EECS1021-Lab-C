import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IterationExercises {

    /**
     * Returns the sum of all odd numbers from the given integer up to 999.
     *
     * @param n	any integer
     * @return the sum of all odd integers from the given integer up to 999.
     */
    public static int addOddsUp(int n) {
        throw new UnsupportedOperationException(); //replace this line!!
    }

    /**
     * Given a string, replaces each digit in the string with that many occurrences of asterisks
     * Example: given the String "boole7an", return the String "boole*******an".
     *
     * @param str
     * @return an "asterisked up" string
     */
    public static String asteriskUp(String str) {
        throw new UnsupportedOperationException(); //replace this line!!
    }

    /**
     * Return the number of characters in String str2 that are also in String str1.
     * Example 1: if str1 is Pizza and str2 is Pepperoni, the function should return 4.
     * Example 2: if str1 is Pepperoni and str2 is Pizza, the function should return 2.
     *
     * @param str1	a String
     * @param str2	a String
     * @return	the number of characters in str1 that occur in str2.
     */
    public static int countCharacters(String str1, String str2) {
        throw new UnsupportedOperationException(); //replace this line!!
    }

    /**
     * Given array arr1 and ArrayList arr2, return True if every element of arr1 appears in arr2.
     *
     * @param arr1	an array of elements
     * @param arr2	an ArrayList of elements
     *
     * @return	True if every element of arr1 appears in arr2.
     */
    public static boolean inArrayList(int[] arr1, ArrayList<Integer> arr2) {
        throw new UnsupportedOperationException(); //replace this line!!
    }

    /**
     * Return a HashMap that includes unique characters in a String
     * as keys and the number of times they occur in the
     * String as the value. Make sure your counts are case-insensitive
     * (convert all upper case letters to lower case before counting).
     *
     * @param str a String
     * @return a hashmap that shows frequency count of characters in the string
     */
    public static HashMap<Character, Integer> countOccurences(String str) {
        throw new UnsupportedOperationException(); //replace this line!!
    }

    /**
     * Main method
     *
     * @param args	method arguments, if any
     */
    public static void main(String[] args) {

        try {
            System.out.println(asteriskUp("hell8o"));
        }  catch (Exception e) {
            System.out.println("You have to implement the asteriskUp method!");
            System.exit(1); //0 indicates no error, 1 indicates something went awry
        }

        try {
            System.out.println(countCharacters("Pizza", "Pepperoni"));
        }  catch (Exception e) {
            System.out.println("You have to implement the countCharacters method!");
            System.exit(1); //0 indicates no error, 1 indicates something went awry
        }

        try {
            System.out.println(addOddsUp(8));
        }  catch (Exception e) {
            System.out.println("You have to implement the addOdds method!");
            System.exit(1); //0 indicates no error, 1 indicates something went awry
        }

        try {
            int[] arr1 = {4, 5, 6, 8};
            ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 5, 5));
            System.out.println(inArrayList(arr1, arr2));
        }  catch (Exception e) {
            System.out.println("You have to implement the inArrayList method!");
            System.exit(1); //0 indicates no error, 1 indicates something went awry
        }

        try {
            int[] arr = {1, 2, 3, 4, 1, 1, 3, 3, 3, 5};
            System.out.println(countOccurences("Hi there!"));
        } catch (Exception e) {
            System.out.println("You have to implement the countOccurences method!");
            System.exit(1); //0 indicates no error, 1 indicates something went awry
        }

    }

}
