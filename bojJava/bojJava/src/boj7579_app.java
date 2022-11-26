import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj7579_app {

    public static void main(String[] args) throws IOException {        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] m = new int[N + 1];
        st = new StringTokenizer(input.readLine());
        int minM = Integer.MIN_VALUE;
        for (int i = 1; i <= N; i++) {
            m[i] = Integer.parseInt(st.nextToken());
            minM = Math.min(minM, m[i]);
        }

        int[] c = new int[N + 1];
        st = new StringTokenizer(input.readLine());
        for (int i = 1; i <= N; i++) {
            c[i] = Integer.parseInt(st.nextToken());
        }


        int[] dp = new int[M+1];
        Arrays.fill(dp, 10000001);
        for (int i = 1; i < N+1 ; i++) {
            for (int j = 1; j <= M; j++) {
                dp[j] = Math.min(dp[j], (j-m[i]<1?0:dp[j-m[i]])+c[i]);
            }
        }
        System.out.println(Arrays.toString(dp));
        System.out.println(dp[M]);


    }
}
