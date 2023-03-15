
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sort {
    public static List<int[]> pairSum(int[] arr, int s) {
        Arrays.sort(arr);

        int end = arr.length;

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] + arr[j] == s) {
                    int[] pair = new int[2];
                    pair[0] = arr[i];
                    pair[1] = arr[j];

                    Arrays.sort(pair);

                    list.add(pair);
                }
            }
        }

        return list;
    }

    public class SortZeroSecondLogic {
        int arr[] = { 1, 0, 1, 1, 0, 0, 0, 1, 1, 1 };

        Sort S = new Sort();

    }
}
