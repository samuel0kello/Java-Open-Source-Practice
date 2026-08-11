package Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me input");
        int n = sc.nextInt();
        // {5,23,55,10,32,41} //
        int[] arr =new int [n];
        System.out.println("Array Element");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<=n-1;i++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
