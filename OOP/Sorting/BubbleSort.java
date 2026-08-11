package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
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
        for(int i=1;i<=n-1;i++) {
            int swap = 0; // O(n) TC if already sorted //
            for(int j=0;j<n-i;j++){ // O(n raise 2) //
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = 1;
                }
            }
            if(swap == 0){
                break;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
