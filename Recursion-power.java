// CAlculating power using recursion

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        int ans = 1;
        while (n>0){
            ans*= x;
            n--;
        }
        System.out.println(ans);

    }
}
