import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1546_average {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int maxScore=0;
        int sum = 0;
        int n = N;
        while(n-->0){
            int score = Integer.parseInt(st.nextToken());
            maxScore = Math.max(maxScore, score);
            scores[n] = score;
            sum += score;
        }
        System.out.println(((sum/(double)maxScore)*100)/N);
    }

}
