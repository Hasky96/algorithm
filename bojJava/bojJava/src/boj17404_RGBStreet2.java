import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj17404_RGBStreet2 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int[][] rgb =  new int[N+1][3];

        StringTokenizer st;
        for (int i = 1; i <= N ; i++) {
            st = new StringTokenizer(in.readLine());
            rgb[i][0] = Integer.parseInt(st.nextToken());
            rgb[i][1] = Integer.parseInt(st.nextToken());
            rgb[i][2] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[N+1][3];
        int min = Integer.MAX_VALUE;
        // first house
        for (int i = 0; i < 3; i++) {
            dp[1][0] = 1000001;
            dp[1][1] = 1000001;
            dp[1][2] = 1000001;
            dp[1][i] = rgb[1][i];

            for (int j = 2; j < N+1; j++) {
                dp[j][0] = Math.min(dp[j-1][1], dp[j-1][2]) + rgb[j][0];
                dp[j][1] = Math.min(dp[j-1][0], dp[j-1][2]) + rgb[j][1];
                dp[j][2] = Math.min(dp[j-1][0], dp[j-1][1]) + rgb[j][2];
            }

            dp[N][i] = 1000001;
            min = Math.min(min,dp[N][0]);
            min = Math.min(min,dp[N][1]);
            min = Math.min(min,dp[N][2]);

        }
        System.out.println(min);

    }
}
