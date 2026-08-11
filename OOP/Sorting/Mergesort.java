package Sorting;

import java.util.Arrays;
import java.util.ArrayList;
public class Mergesort {
    public static void main(String[] args) {
        int [] arr = {1,4,2,5,3};
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesort(int [] arr,int low,int high){
        if(low == high){
            return;
        }
        int mid = (high+low)/2;
        // left array
        mergesort(arr,low,mid);
        // right array
        mergesort(arr,mid+1,high);
        // merge array
        merge(arr,low,mid,high);
    }
    public static void merge(int [] arr, int low, int mid, int high){
        int i = low;
        int j = mid+1;
        ArrayList<Integer>arr2 = new ArrayList<>();
        while((i <= mid) && (j <= high)) {
            if (arr[i] <= arr[j]) {
                arr2.add(arr[i]);
                i++;
            } else {
                arr2.add(arr[j]);
                j++;
            }
        }
        while(i <= mid) {
                arr2.add(arr[i]);
                i++;
        }
        while(j <= high){
                arr2.add(arr[j]);
                j++;
        }
        for(int k=0;k<arr2.size();k++){
                arr[k+low] = arr2.get(k);
        }
    }
}
