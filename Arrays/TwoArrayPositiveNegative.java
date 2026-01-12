import java.util.*;

public class TwoArrayPositiveNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int[] arr = new int[n];
        int[] positive = new int[n];
        int[] negative = new int[n];

        int p = 0, ng = 0;

        System.out.println("Enter 10 numbers (positive and negative):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Separate positive and negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positive[p++] = arr[i];
            } else {
                negative[ng++] = arr[i];
            }
        }

        System.out.println("Positive numbers:");
        for (int i = 0; i < p; i++) {
            System.out.print(positive[i] + " ");
        }

        System.out.println("\nNegative numbers:");
        for (int i = 0; i < ng; i++) {
            System.out.print(negative[i] + " ");
        }
    }
}
