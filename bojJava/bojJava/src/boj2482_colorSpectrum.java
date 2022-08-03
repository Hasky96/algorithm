import java.util.Scanner;

public class boj2482_colorSpectrum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] dp = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            dp[i][0] = 1;
            dp[i][1] = i;

        }

        for (int i = 3; i <= N; i++) {
            for (int j = 2; j <= (i+1)/2 ; j++) {
                // i개의 색상에서 최대로 뽑을 수 있는 경우 (i+1)/2
                dp[i][j] = (dp[i-1][j] + dp[i-2][j-1]) % 1_000_000_003;
            }
        }

        System.out.println((dp[N-3][K-1] + dp[N-1][K]) % 1_000_000_003);
    }
}
