import java.util.*;
public class BubbleSort {
    public static void bubblesort(int arr[]){
        for(int i = 0 ; i<arr.length-1 ; i++){
            for(int j = 0 ; j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0 ; i < arr.length ;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5 , 4 , 3 , 2 , 1};
        bubblesort(arr);
        printArr(arr);


    }
}
//Time Complexity = O(n^2)