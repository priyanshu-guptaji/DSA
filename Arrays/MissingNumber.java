public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2 , 4 ,5};
        int n = arr.length +1;
        
        int expectedSum = n * (n+1) / 2;
        int actualSum =0;
        
        for(int i = 0 ; i < arr.length ; i++){
            actualSum += arr[i];
        }
        
         int missing = expectedSum - actualSum;
        System.out.println("Missing number: " + missing);
    }

}
