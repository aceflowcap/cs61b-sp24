import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class JavaExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        // TODO: Fill in this function.
        int[] dice = {1, 2, 3, 4, 5, 6};
        return dice;
    }

    /** Returns the order depending on the customer.
     *  If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     *  If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     *  In any other case, return an empty String[] of size 3. */
    public static String[] takeOrder(String customer) {

        String[] strlist;
        if (customer.equals("Ergun")) {
            strlist = new String[] {"beyti", "pizza", "hamburger", "tea"};
        } else if (customer.equals("Erik")) {
            strlist = new String[] {"sushi", "pasta", "avocado", "coffee"};
        } else {
            strlist = new String[] {"", "", ""};
        }
        return strlist;
    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {
        // TODO: Fill in this function.
        int min, max;
        min = 0;
        max = 0;
        for (int i : array) {
            if (min == 0 && max == 0) {
                min = i;
                max = i;
            } else if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        return max - min;
    }

    /**
      * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
      * Hailstone sequence is described as:
      *    - Pick a positive integer n as the start
      *        - If n is even, divide n by 2
      *        - If n is odd, multiply n by 3 and add 1
      *    - Continue this process until n is 1
      */
    public static List<Integer> hailstone(int n) {
        return hailstoneHelper(n, new ArrayList<>());
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        // TODO: Fill in this function.
        list.add(x);
        if (x == 1) {
            return list;
        } else if (x % 2 == 1) {
            return hailstoneHelper(3*x+1, list);
        } else {
            return hailstoneHelper(x / 2, list);
        }

    }

}
