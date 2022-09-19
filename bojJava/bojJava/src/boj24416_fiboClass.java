import java.util.Scanner;

public class boj24416_fiboClass {

    private static int[] f;
    static int N, cnt1, cnt2;

    public static void main(String[] args) {
        N = new Scanner(System.in).nextInt();
        f = new int[N+1];
        fib(N);
        fibonacci(N);
        System.out.println(cnt1+1+" "+cnt2);
    }

    public static int fib(int n){
        if (n == 1 || n == 2) return 1;  // 코드1
        cnt1++;
        return (fib(n - 1) + fib(n - 2));
    }

    public  static int fibonacci(int n){

        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= N ; i++) {
            cnt2++;
            f[i] = f[i-1]+f[i-2];
        }
        return f[n];
    }
}
