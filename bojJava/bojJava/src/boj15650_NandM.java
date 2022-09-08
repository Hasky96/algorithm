import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj15650_NandM {

    private static int M;
    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        backtracking(0,0,new StringBuilder());

    }

    public static void backtracking(int n, int i, StringBuilder sb){

        if(n == M){
            System.out.println(sb);
            return;
        }

        for (int j = i + 1; j <= N; j++) {
            sb.append(j).append(" ");
            backtracking(n+1, j, sb);
            sb.setLength(sb.length()-2);
        }

    }
}
