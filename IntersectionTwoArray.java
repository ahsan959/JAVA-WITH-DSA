import java.util.Arrays;
import java.util.HashSet;

public class IntersectionTwoArray {
    public static void main(String[] args) {
        int arr1[] = { 2, 3, 4, 5, 6 };
        int arr2[] = { 4, 6, 7, 8, 9 };

        // Declare hashset
        HashSet<Integer> set1 = new HashSet();

        // Traverse an array, put each element in a set
        for (int val : arr1) {
            set1.add(val);
        }

        /**
         * Traverse second array values,
         * Search the value in a set (set1),
         * If element is found then print it.
         */
        for (int val : arr2) {
            if (set1.contains(val)) {
                System.out.println(val);
            }
        }
    }

}
