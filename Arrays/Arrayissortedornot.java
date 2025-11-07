//Check if an array is sorted or not
public class Arrayissortedornot {
    public static boolean isSorted(int arr[] , int n){
        for(int i=0 ; i< n-1 ;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1 ,2,3,4,5};
        int n = arr.length;
        System.out.println(isSorted(arr, n));
    }
}
