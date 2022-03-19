package Sorting;

import java.util.Arrays;

public class countSort{

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr = {1,10,30,20,40,0,9,10,15,71,80,9,1};
//        int[] arr = {3,1,9,7,1,2,4};
        int[] arr2 = new int[max(arr)+1];
        for (int i = 0; i <= arr2.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    arr2[i] += 1;
                }
            }
        }
        int[] arr3 = new int[arr.length];
        int b=0;
        for (int a=0; a < arr2.length; a++) {
            while (arr2[a] != 0) {
                arr2[a]--;
                arr3[b] = a;
                b++;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
