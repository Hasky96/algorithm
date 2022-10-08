import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj1049_guitarString {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(input.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> Q1 = new PriorityQueue<>();
        PriorityQueue<Integer> Q2 = new PriorityQueue<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(input.readLine());
            Q1.offer(Integer.parseInt(st.nextToken()));
            Q2.offer(Integer.parseInt(st.nextToken()));
        }
        int setCost = Q1.poll();
        int uniCost = Q2.poll();

        if(setCost>uniCost*6){
            System.out.println(N*uniCost);
        }else{
            System.out.println((N/6*setCost) + Math.min((N%6)*uniCost, setCost));
        }
    }

}
