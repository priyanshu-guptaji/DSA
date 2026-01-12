import java.util.*;

public class SumTwoArraysReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] sum = new int[n];

        System.out.println("Enter 10 elements for First Array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter 10 elements for Second Array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        // Sum logic
        for (int i = 0; i < n; i++) {
            sum[i] = arr1[i] + arr2[n - 1 - i];
        }

        System.out.println("Resultant Sum Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(sum[i] + " ");
        }
    }
}
