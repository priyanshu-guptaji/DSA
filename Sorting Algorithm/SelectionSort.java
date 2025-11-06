import java.time.chrono.MinguoChronology;

public class SelectionSort {
    public static void selectionsort(int arr[]){
        for(int i= 0 ; i<arr.length-1 ;i++){
            int minPos = i;
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[minPos] > arr[j]){
                    minPos =j ;
                }
                
            }
            //Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3 , 2,4,1,5};
        selectionsort(arr);
        printArr(arr);

    }
    
}

//Time Complexity = O(n^2)