import java.util.Scanner;

public class boj10870_Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fibo(sc.nextInt()));
    }

    public static int fibo(int n){
        if(n==0) return 0;
        if(n<=2) return 1;
        return fibo(n-1) + fibo(n-2);
    }
}
