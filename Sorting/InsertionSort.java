package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10,30,20,40,50,15,71,80,9,1};
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while ( j >= 0 && arr[j] > temp ) {
                arr[j + 1]= arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
