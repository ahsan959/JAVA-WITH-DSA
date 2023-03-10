import java.util.Arrays;
import java.util.HashSet;

public class unionOfTwoArray {
    public static void main(String[] args) {
        Integer arr1[] = { 1, 2, 3 };

        // Second Array

        Integer arr2[] = { 4, 5, 6 };

        // Inilize Hashset to perform Union Operation

        HashSet<Integer> set = new HashSet<>();

        // Add First Array to the Set

        set.addAll(Arrays.asList(arr1));

        // add Second Array two the Set

        set.addAll(Arrays.asList(arr2));

        // Convert Array from set

        Integer[] union = {};

        union = set.toArray(union);

        System.out.print("Union of Two Array  " + Arrays.toString(union));

    }

}
