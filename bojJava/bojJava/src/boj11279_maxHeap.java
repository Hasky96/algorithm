import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class boj11279_maxHeap {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(input.readLine());

        PriorityQueue<Integer> Q = new PriorityQueue<Integer>(Comparator.reverseOrder());
        StringBuilder sb =new StringBuilder();
        while(N-->0){
            int x = Integer.parseInt(input.readLine());
            if(x<1){
                if(Q.isEmpty()) sb.append(0).append("\n");
                else sb.append(Q.poll()).append("\n");
            }else Q.offer(x);
        }
        System.out.println(sb.toString());
    }
}
