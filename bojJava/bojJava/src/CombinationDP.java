import java.util.Scanner;

public class CombinationDP {

    private static int[][] dp;
    private static int N,C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        C = sc.nextInt();

        dp = new int[N+1][C+1];

        comb(N,C);

        System.out.println(dp[N][C]);
    }

    private static int comb(int n ,int c){

        if(dp[n][c] > 0){
            System.out.println(n+" C "+c +" = "+ dp[n][c]);
            return dp[n][c];
        }
        else if(n==c || c==0){
            System.out.println(n+" C "+c +" = "+1);
            return 1;
        }
        dp[n][c]=comb(n-1,c-1)+comb(n-1,c);
        System.out.println(n+" C "+c +" = "+ dp[n][c]);
        return dp[n][c];

    }
}
