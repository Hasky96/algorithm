package DP;

import java.util.Scanner;

public class DP2_FiboTest2 {

    private static long fibo(int n){
        long[] D = new long[n+1];
        D[0] = 0;
        D[1] = 1;
        for(int i=2;i<=n; i++){
            D[i] = D[i-1] + D[i-2];
        }
        return D[n];
//        if(n<2) return n;
//        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fibo(N));
    }
}
