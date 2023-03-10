public class Solution {

    public static int findUnique(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = res ^ arr[i];
        }

        return res;
    }
}