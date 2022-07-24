package DP;

import java.util.Scanner;

public class DP1_FiboTest1 {
    static long totalCount1, totalCount2;
    static long[] call1, call2, memo;

    private static long fibo1(int n){
        totalCount1++;
        call1[n]++;
        if(n<2) return n;
        return fibo1(n-1) + fibo1(n-2);
    }
    private static long fibo2(int n){
        totalCount2++;
        call2[n]++;
        if(n>=2 && memo[n]==0) {
            memo[n] = fibo2(n - 2) + fibo2(n - 2);
        }
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        call1 = new long[N+1];
        call2 = new long[N+1];
        memo = new long[N+1];

        memo[0] = 0;
        memo[1] = 1;

        System.out.println(fibo2(N));
        for (int i = 0; i < N; i++) {
            System.out.println("fibo2 " + i +" "+ call2[i]);
        }
        System.out.println(totalCount2);

        System.out.println(fibo1(N));
        for (int i = 0; i < N; i++) {
            System.out.println("fibo2 " + i +" "+ call1[i]);
        }
        System.out.println(totalCount1);
    }
}
