import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10872_Factorial {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(factorial(N));
    }

    public static int factorial(int n){
        if(n<=1) return 1;
        return n * factorial(n-1);
    }
    // 0! => 1
}
