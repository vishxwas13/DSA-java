package Hashing;

public class HashMap1 {

    private static void subArray(int[] arr, int sum) {
        int start =0,end=0, currsum=0;
        java.util.HashMap<Integer,Integer> map = new java.util.HashMap();
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];
            if (currsum==sum){ end = i; break;}
            if (map.containsKey(currsum- sum)) {
                start =map.get(currsum-sum)+1;
                end=i;
                break;
            }
            map.put(currsum,i);
        }
        if (end==0) System.out.println("not");
        else System.out.println(start+" "+end);
    }

    // find the subarray with the given sum and return the indices
    public static void main(String[] args) {
        int[] arr= {10,15,-5,15,-10,5};
        int sum=5;
        subArray(arr,sum);
    }
}
