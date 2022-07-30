package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_HamburgerDiet {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(in.readLine());

        for (int t = 1; t <= T ; t++) {
            int N, L;
            StringTokenizer st = new StringTokenizer(in.readLine());

            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());

            int[] scores = new int[N+1];
            int[] kal = new int[N+1];

            for (int i = 1; i <= N; i++) {
                st = new StringTokenizer(in.readLine());
                scores[i] = Integer.parseInt(st.nextToken());
                kal[i] = Integer.parseInt(st.nextToken());
            }

            int[][] D = new int[N+1][L+1];

            for (int i = 1; i <= N ; i++) {
                for (int k = 1; k <=L ; k++) {

                    if(kal[i] <= k){
                        D[i][k] = Math.max(D[i-1][k] , scores[i] + D[i-1][k- kal[i]]);
                    }else{
                        D[i][k] = D[i-1][k];
                    }

                }
            }
            System.out.println("#"+t+" "+D[N][L]);
        }

    }
}
