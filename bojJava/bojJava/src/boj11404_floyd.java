import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj11404_floyd {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int M = Integer.parseInt(in.readLine());
        
        int[][] map= new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if(i==j) map[i][i] = 0;
                else map[i][j] = 10000000;
            }

        }


        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(in.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            map[from][to] = Math.min(map[from][to],cost);
        }


        for (int k = 1; k <= N ; k++) {
            for (int i = 1; i <= N ; i++) {
                for (int j = 1; j <= N ; j++) {
                    if(i!=j && i!=k && j!=k) map[i][j] = Math.min(map[i][j], map[i][k]+map[k][j]);
                }
            }
        }

        for (int i = 1; i <=N ; i++) {
            for (int j = 1; j <=N ; j++) {
                if(map[i][j] >= 10000000) map[i][j] = 0;
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
