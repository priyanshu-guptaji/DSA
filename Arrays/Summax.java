import java.util.*;

public class Summax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[n];

        System.out.println("Enter 10 elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Sort array
        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[n - 1];

        // Step 2: Expected sum from min to max
        int count = max - min + 1;
        int expectedSum = count * (min + max) / 2;

        // Step 3: Actual sum
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }

        int missingSum = expectedSum - actualSum;

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum of missing numbers: " + missingSum);
    }
}
