import java.util.*;

public class Swapno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[n];

        System.out.println("Enter 10 elements into the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before swapping:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Swapping logic
        for (int i = 0; i < n - 1; i++) {   // n-1 to avoid out of bound
            if (arr[i] % 10 == 0) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i++; 
            }
        }

        System.out.println("\nAfter swapping:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
