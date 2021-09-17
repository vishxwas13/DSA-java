// CAlculating power using recursion

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int power = scan.nextInt();
        int result = 1;
        System.out.println(pow(num,power));

    }
    public static int pow(int m,int n){
        if (n==0){
            return 1;
        }
        if (n%2==0){
            return pow(m*m,n/2);
        }
        else {
            return m*(pow(m*m,(n-1)/2));
        }
    }
}
