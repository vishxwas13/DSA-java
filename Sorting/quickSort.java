package Sorting;

import java.util.Arrays;
public class quickSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr,int l, int h) {
        int pivot = arr[l];
        int j = h, i = l;
        while (i < j) {
            while (arr[i] <= pivot && i <= h - 1) i++;
            while (arr[j] > pivot && j >= l) j--;
            if (i < j)
                swap(arr, i, j);
        }
        swap(arr, l, j);
        return j;
    }

    public static void QuickSort(int[] arr,int l, int h) {
        if (l<h) {
            int pivot = partition(arr, l, h);
            QuickSort(arr, l, pivot - 1);
            QuickSort(arr, pivot+1, h);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,30,20,40,0,15,71,80,9,1};
        QuickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
