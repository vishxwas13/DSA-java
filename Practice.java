import java.util.Scanner;

/*

--> UNSOLVED <--

Count numbers in a range that are divisible by all array elements.

Input: a[] = {1, 4, 2], L = 1, R = 10
Output : 2
In range [1, 10], the numbers 4 and 8 are divisible by all the array elements.
Input : a[] = {1, 3, 2], L = 7, R = 11
Output : 0


 */
public class Practice {
    static int countNumbers(int a[], int n, int l, int r) {
        int count =r-l+1;
        for (int i = l; i <= r; i++) {
            for (int j = 0; j<n;j++){
                if (i%a[j]!=0){
                    count--;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n,l,r;
        Scanner scan = new Scanner(System.in);
        System.out.println("size of an array-->");
        n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("array-->");
        for (int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("range-->");
        l = scan.nextInt();
        r = scan.nextInt();
        System.out.println( countNumbers(arr,n,l,r));
    }
}
