public class KadaneAlgorithm {

    public static int maxSubarraySum(int[] arr) {

        int currentSum = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);

            max= Math.max(max, currentSum);
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubarraySum(arr);

        System.out.println("Maximum subarray sum = " + result);
    }
}