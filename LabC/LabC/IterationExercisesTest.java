import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class IterationExercisesTest {

    @Test
    void addOddsTest() {
        int result = IterationExercises.addOddsUp(8);
        assertEquals(249984, result);
    }

    @Test
    void asteriskUpTest() {
        String result = IterationExercises.asteriskUp("hell8o");
        assertEquals("hell********o", result);
    }

    @Test
    void countCharactersTest() {
        String str1 = "Pizza";
        String str2 = "Pepperoni";
        int result =  IterationExercises.countCharacters(str1, str2);
        assertEquals(2, result);
    }

    @Test
    void inArrayListTest() {
        int[] arr1 = {4, 5, 6, 8};
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 5, 5));
        boolean result = IterationExercises.inArrayList(arr1,arr2);
        assertEquals(false, result);
    }

    @Test
    void countOccurrences() {
        HashMap<Character, Integer> testHash = new HashMap<Character, Integer>();
        testHash.put('a',1);
        testHash.put('r',1);
        testHash.put('e',3);
        testHash.put('w',2);
        testHash.put('h',2);
        testHash.put('y',1);
        testHash.put('i',2);
        testHash.put('n',1);
        testHash.put('t',1);
        testHash.put('s',3);
        testHash.put('m',1);
        testHash.put('.',1);
        HashMap<Character, Integer> result = IterationExercises.countOccurences("Why are we in this mess.");
        for (Character k: testHash.keySet()){
            Integer v = result.get(k);
            assertEquals(testHash.get(k),v,"Failed when key is " + k);
        }
    }

    //Make sure to write your own tests
    //Remember edge and corner cases!

    //HIDDEN TESTS BELOW

    @Test
    void addOddsTest1() {
        try {
            int result = IterationExercises.addOddsUp(409);
            assertEquals(208384, result, "Failed when input is 22");
        } catch (UnsupportedOperationException e) {
            assertTrue(false, "addOdds NOT IMPLEMENTED (test 1)");
        }
    }

    @Test
    void addOddsTest2() {
        Throwable exception = assertThrows(AssertionError.class, () -> IterationExercises.addOddsUp(-1),"Failed to throw assertion error with input = -1");
        assertEquals(AssertionError.class, exception.getClass(), "Failed to throw assertion error with input = -1");
    }

    @Test
    void asteriskUpTest1() {
        try {
            String result = IterationExercises.asteriskUp("ble1sh71");
            assertEquals("ble*sh********", result, "Failed when input is ble1sh71");
        } catch (UnsupportedOperationException e) {
            assertTrue(false, "asteriskUp NOT IMPLEMENTED (test 1)");
        }
    }

    @Test
    void asteriskUpTest2() {
        try {
            String result = IterationExercises.asteriskUp("1n8kk");
            assertEquals("*n********kk", result, "Failed when input is 1n8kk");
        } catch (UnsupportedOperationException e) {
            assertTrue(false, "asteriskUp NOT IMPLEMENTED (test 2)");
        }
    }


    @Test
    void countCharactersTest1() {
        String str1 = "Peanut";
        String str2 = "Snack";
        try {
            int result =  IterationExercises.countCharacters(str1, str2);
            assertEquals(2, result, "Failed when input is Peanut and Snack");
        } catch (UnsupportedOperationException e) {
            assertTrue(false, "countCharacters NOT IMPLEMENTED (test 1)");
        }
    }

    @Test
    void countCharactersTest2() {
        try {
            String str1 = "Tunafish";
            String str2 = "Creep";
            int result =  IterationExercises.countCharacters(str1, str2);
            assertEquals(0, result, "Failed when input is Tunafish and Creep");
        } catch (UnsupportedOperationException e) {
            assertTrue(false, "countCharacters NOT IMPLEMENTED (test 2)");
        }
    }


    @Test
    void inArrayListTest1() {
        try {
            int[] arr1 = {9,1,6,2,3};
            ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(1, 2, 6, 9, 9, 5));
            boolean result = IterationExercises.inArrayList(arr1,arr2);
            assertEquals(false, result, "Failed when 4 elements shared");
        } catch (UnsupportedOperationException e) {
            assertTrue(false, "inArrayList NOT IMPLEMENTED (test 1)");
        }
    }

    @Test
    void inArrayListTest2() {
        try {
            int[] arr1 = {4,3,2,1};
            ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(8,7,6,5));
            boolean result = IterationExercises.inArrayList(arr1,arr2);
            assertEquals(false, result, "Failed when 0 elements shared");
        } catch (UnsupportedOperationException e) {
            assertTrue(false, "inArrayList NOT IMPLEMENTED (test 2)");
        }
    }

    @Test
    void countOccurrencesTest1() {
        try {
            HashMap<Character, Integer> testHash = new HashMap<Character, Integer>();
            testHash.put('b',3);
            testHash.put('o',1);
            testHash.put('g',1);
            testHash.put('u',2);
            testHash.put('s',1);
            testHash.put('t',1);
            testHash.put('a',2);
            testHash.put('l',1);
            testHash.put('n',1);
            testHash.put('c',1);
            testHash.put('e',1);
            testHash.put('d',1);
            testHash.put('.',1);
            HashMap<Character, Integer> result = IterationExercises.countOccurences("Bogus but balanced.");
            for (Character k: testHash.keySet()){
                Integer v = result.get(k);
                assertEquals(v, testHash.get(k), "Failed when key is:" + k);
            }
        } catch (UnsupportedOperationException e) {
            assertTrue(false, "countOccurences NOT IMPLEMENTED (test 1)");
        }
    }

}
