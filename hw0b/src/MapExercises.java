import java.util.*;


public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0;i<alphabet.length();i++) {
            map.put(alphabet.charAt(i), i+1);
        }
        return map;
    }

    public static int square(int n) {
        return n * n;
    }
    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, square(i));
        }
        return map;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            int x = 1;
            if (map.containsKey(word)) {
                x = map.get(word) + 1;
            }
            map.put(word, x);
        }
        return map;
    }
}
