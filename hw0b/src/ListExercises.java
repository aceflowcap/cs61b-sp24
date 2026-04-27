import java.util.*;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int sums = 0;
        for (int i : L) {
            sums += i;
        }
        return sums;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> evs = new ArrayList<>();
        for (int i : L) {
            if (i % 2 == 0) {
                evs.add(i);
            }
        }
        return evs;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> commons = new ArrayList<>();
        for (int i : L1) {
            for (int j : L2) {
                if (i == j) {
                    commons.add(i);
                    break;
                }
            }
        }
        return commons;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count = 0;
        for (String word : words) {
            for (int i=0;i<word.length();i++) {
                if (word.charAt(i) == c) {
                    count++;
                }
            }
        }
        return count;
    }
}
