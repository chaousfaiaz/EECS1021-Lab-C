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
        int sum = 0;
for(int i = n; i<=999; i++){
if(1%2 != 0){
sum +=i;
}}
return sum;
} //replace this line!!
    

    /**
     * Given a string, replaces each digit in the string with that many occurrences of asterisks
     * Example: given the String "boole7an", return the String "boole*******an".
     *
     * @param str
     * @return an "asterisked up" string
     */
    public static String asteriskUp(String str) {
        StringBuilder result = new StringBuilder();
char c = str.charAt(i);
//check if character is a digit
if(Character.isDigit(c)){
int count = Character.getNumericValue(c);
for (intj= 0; j<count; j++){
result.append('+');
}
}else{
result.append(c);
}
return result.toString(); //replace this line!!
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
        int count = 0;
str1 = str1.toLowerCase();
str2 = str2.toLowerCase(); //replace this line!!
        //use nested loop to compare each character of str1 with each characters od str2
for(int i = 0; i<str1.length(); i++){
char c1 = str1.charAt(i);
for (int j = 0; j<str2.length(); j++){
char c2 = str2.charAt(j);
if(c1 == c2){
count++;
break;
}}}
return count;
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
        for(int num:arr1){
//check if arr2 contains the current elment from arr1
if(!arr2.contains(num)){
return false;
}} return true;//replace this line!!
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
      HashMap Character, Integer> counts = new HashMap ();
// convert the string to lowercase to majke the counting case insensitive.
str = str.toLowerCase();
//iterate through each charctr in string
for(char c: str.toCharArray()){
//check if character si already in hashmap
if(counts.containskey(c)){
//increment the count for the character
counts.put(c,counts.get(c) +1);
}else{
//add th character to hash map with a count of 1
counts.put(c,1);
}}
return counts; //replace this line!!
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
