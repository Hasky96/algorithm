import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11051_binomialCoeffient {
    
    // Factorial 함수를 사용하기에는 숫자가 너무크다...
    // 범위가 1~1000 이기 때문에
    // 12! 이상은 안쓰는게 바람직한 거 같다. int 범위 한계
    // 20! long범위 한계
    // DP로 접근해보자!

    static int N, K;

    static int[][] dp;
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(input.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        dp = new int[N + 1][K + 1];
        System.out.println(BC(N,K));
    }

    static int BC(int N, int K) {

        if(dp[N][K] > 0) {
            return dp[N][K];
        }

        if(N == K || K == 0) {
            return dp[N][K] = 1;
        }

        return dp[N][K] = (BC(N - 1, K - 1) + BC(N - 1, K)) % 10007;
    }


/* Moduler
*  34 % 7 = 6 => 4*7+6
*  27 % 7 = 6 => 3*7+6
*  (A+B)%n = ((A%n)+(B%n))%n
*  (A*B)%n = ((A%n)*(B%n))%n
* */


}
