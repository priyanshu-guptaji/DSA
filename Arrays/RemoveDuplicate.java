import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,11,1,2,3,4,5,66,6,6,6};

        Arrays.sort(arr);

        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
