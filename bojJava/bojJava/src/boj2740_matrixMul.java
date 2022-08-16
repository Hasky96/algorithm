import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj2740_matrixMul {
        static  int arr1[][];
        static  int arr2[][];
        static  int result[][];

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int N1 = Integer.parseInt(st.nextToken());
        int M1 = Integer.parseInt(st.nextToken());

        arr1 = new int[N1][M1];
        for (int i = 0; i < N1; i++) {
            st = new StringTokenizer(in.readLine());
            for (int j = 0; j < M1; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(in.readLine());
        int N2 = Integer.parseInt(st.nextToken());
        int M2 = Integer.parseInt(st.nextToken());

        arr2 = new int[N2][M2];
        for (int i = 0; i < N2; i++) {
            st = new StringTokenizer(in.readLine());
            for (int j = 0; j < M2; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        result = new int[N1][M2];

        for (int i = 0; i < N1; i++) {
            for (int j = 0; j < M2; j++) {
                result[i][j] = mul(i, j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int[] tmp: result) {
            for (int t: tmp) {
                sb.append(t).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());

    }

    public static int mul(int i,int j){
        int res = 0;
        for (int k = 0; k < arr1[0].length; k++) {
            res += arr1[i][k] * arr2[k][j];
        }
        return res;
    }
}
