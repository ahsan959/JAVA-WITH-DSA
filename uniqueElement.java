import java.util.Scanner;

class Finder {
    public static int findUniqueElement(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}

public class uniqueElement {

    public static void main(String[] args) {
        Finder f = new Finder();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int numbers = sc.nextInt();

        // Vector<Integer> arr=new Vector<>(numbers);

        int arr[];
        arr = new int[12];
        System.out.println("Enter the array Elements");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int findUnique = f.findUniqueElement(arr);

        System.out.println("Unique Elements ..." + findUnique);

    }

}
