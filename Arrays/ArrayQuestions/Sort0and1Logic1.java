package ArrayQuestions;

public class Sort0and1Logic1 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 0, 1, 0, 1, 1, 1 };
        int start = 0;
        int end = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;

                i++;
                start++;

            }
            if (arr[i] == 1) {
                int demp = arr[i];
                arr[i] = arr[end];
                arr[end] = demp;

                end--;
                i++;

            }
        }

    }

}
