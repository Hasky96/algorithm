import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj1026_treasure {

    public static void main(String[] args) throws IOException {

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(inp.readLine());

        StringTokenizer st1 = new StringTokenizer(inp.readLine());
        StringTokenizer st2 = new StringTokenizer(inp.readLine());

        PriorityQueue<Integer> q1 = new PriorityQueue(Comparator.reverseOrder());
        PriorityQueue<Integer> q2 = new PriorityQueue();

        for (int i = 0; i < N; i++) {
            q1.offer(Integer.parseInt(st1.nextToken()));
            q2.offer(Integer.parseInt(st2.nextToken()));
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans+= q1.poll() * q2.poll();
        }
        System.out.println(ans);
    }
}
