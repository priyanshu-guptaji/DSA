import java.util.*;

public class SumOfPositiveAndNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 20;
        int[] arr = new int[n];
        int[] positive = new int[n];
        int[] negativeArr = new int[n];

        int p = 0, ng = 0;

        System.out.println("Enter 20 numbers (positive and negative):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Separate positive and negative
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positive[p++] = arr[i];
            } else {
                negativeArr[ng++] = arr[i];
            }
        }

        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;
        int sumNegative = 0;

        // Sum positive even & odd
        for (int i = 0; i < p; i++) {
            if (positive[i] % 2 == 0) {
                sumPositiveEven += positive[i];
            } else {
                sumPositiveOdd += positive[i];
            }
        }

        // Sum negative numbers
        for (int i = 0; i < ng; i++) {
            sumNegative += negativeArr[i];
        }

        System.out.println("\nPositive numbers:");
        for (int i = 0; i < p; i++) {
            System.out.print(positive[i] + " ");
        }

        System.out.println("\nNegative numbers:");
        for (int i = 0; i < ng; i++) {
            System.out.print(negativeArr[i] + " ");
        }

        System.out.println("\n\nSum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
        System.out.println("Sum of negative numbers: " + sumNegative);
    }
}
