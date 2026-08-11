package Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Give me input");
//        int n = sc.nextInt();
        // {5,23,55,10,32,41} //
        int[] arr = {13,46,24,52,20,9};
//        System.out.println("Array Element");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<=arr.length-2;i++) {
            int min = i;
            for(int j=i;j<=arr.length-1;j++) {
                if (arr[j] < arr[min]){
                   min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.print(Arrays.toString(arr));
    }
}

