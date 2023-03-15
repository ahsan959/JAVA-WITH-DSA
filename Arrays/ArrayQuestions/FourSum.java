package ArrayQuestions;

public class FourSum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = 8;

        for (int i = 0; i < arr.length; i++) {
            int element1 = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                int element2 = arr[j];

                for (int k = i + 2; k < arr.length; k++) {
                    int element3 = arr[k];

                    for (int l = k + 1; l < arr.length; l++) {
                        int element4 = arr[l];

                        if (element1 + element2 + element3 + element4 == sum) {
                            System.out.println(element1 + "," + element2 + "," + element3 + "," + element4);
                        }

                    }
                }
            }
        }

    }

}
