import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj15651_NandM {

    public static StringBuilder ans;
    public static int N,M;
    public static void main(String[] args) throws IOException {
        ans = new StringBuilder();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        bt(0, new StringBuilder());
        System.out.println(ans.toString());
    }

    public static void bt(int level, StringBuilder sb){
        if(level == M){
            ans.append(sb).append("\n");
            return;
        }
        for (int i = 1; i <= N ; i++) {
            sb.append(i+" ");
            bt(level+1, sb);
            sb.setLength(2*level);
        }
    }

}
