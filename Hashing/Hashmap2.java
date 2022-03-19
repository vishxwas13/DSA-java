package Hashing;

public class Hashmap2 {
    public static void subArray(int[] arr) {
        int currsum=0;
        int maxlength = 0;
        java.util.HashMap<Integer,Integer> map = new java.util.HashMap();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) arr[i]=-1;
        }
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            if (currsum==0){ maxlength=i+1;}
            if (map.containsKey(currsum)) {
                if (maxlength<i-map.get(currsum)) maxlength=i-map.get(currsum);
            }else map.put(currsum,i);
        }
        System.out.println(maxlength);
    }
    //Find the largest subarray with equal no. of 0's and 1's
    //        same as previous one only change is to convert all 0 into -1 and find subarray with sum =0.
    public static void main(String[] args) {
        int[] arr= { 1, 0, 0, 1, 0, 1, 1 };
        subArray(arr);
    }
}
