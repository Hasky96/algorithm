import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj15652_NandM {

    public static int N,M;
    public static StringBuilder ans = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        bt(0,1, new StringBuilder());
        System.out.println(ans);
    }

    public static void bt(int level, int start, StringBuilder sb){
        if(level==M){
            ans.append(sb).append("\n");
            return;
        }

        for (int i = start; i <= N; i++) {
            sb.append(i).append(" ");
            bt(level+1, i, sb);
            sb.setLength(2*level);
        }
    }
}
