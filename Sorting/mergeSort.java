package Sorting;

import java.util.Arrays;

public class mergeSort {

    public static void mergeSort(int[] arr, int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr,mid+1, h);
            merge(arr,l,mid,h);
        }
    }

    public static void merge(int[] arr, int l, int mid, int h) {
        int[] brr = new int[arr.length];
        int i =l;
        int j = mid+1;
        int k = l;
        while (i <= mid && j <=h ) {
            if (arr[i] < arr[j]) {
                brr[k] = arr[i];
                i++;
            }else {
                brr[k] = arr[j];
                j++;
            }
            k++;
        }
// remaining element from l to mid, if exists
            while (j <= h) {
                brr[k] = arr[j];
                k++;j++;
            }
// remaining element from mid to h, if exists
            while (i <= mid) {
                brr[k] = arr[i];
                k++;i++;
            }

//        copy
        for (int c = l; c <= h; c++) {
            arr[c] =brr[c];
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,30,20,40,0,15,71,80,9,1};

        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
