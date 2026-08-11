package Sorting;

import java.util.Arrays;
public class Quicksort {
    public static void main(String[] args) {
        int [] arr = {1,4,2,5,4};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quicksort(int [] arr,int low,int high){
        if(low < high){
            // pivot means starting element of array //
            int pivot = pivot(arr,low,high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);
        }
    }
    public static int pivot(int [] arr,int low,int high){
        int i = low;
        int j = high;
        while(i < j){
            while(arr[i] <= arr[low] && i <= high-1 ){
                i++;
            }
            while (arr[j] > arr[low] && j >= low+1) {
                j--;

            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}
