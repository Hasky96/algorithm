import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj7579_app {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine());

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        int[] A = new int[N+1];
        st = new StringTokenizer(input.readLine());
        for (int i = 1; i <= N ; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int[] m = new int[N+1];
        st = new StringTokenizer(input.readLine());
        int minM = Integer.MIN_VALUE;
        for (int i = 1; i <= N ; i++) {
            m[i] = Integer.parseInt(st.nextToken());
            minM = Math.min(minM, m[i]);
        }

        int dp[] = new int[M+1];

    }
}
