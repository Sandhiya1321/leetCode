
import java.util.Scanner;

class moveZeros {
    public static int[] moveZero(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != k) {
                    int temp = arr[k];
                    arr[k] = arr[i];
                    arr[i] = temp;
                }
                k++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = scan.nextInt();
        System.out.println("Enter the array:");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        arr = moveZero(arr);

        System.out.println("Array after moving zeros:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
