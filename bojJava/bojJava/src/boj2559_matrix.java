import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj2559_matrix {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(input.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        int max=arr[0];
        for (int i = 1; i < N; i++) {
            int j = Integer.parseInt(st.nextToken());
            arr[i] = arr[i - 1] + j;
            max = Math.max(max, j);
        }

//        System.out.println(Arrays.toString(arr));
        if(N==K){
            System.out.println(arr[arr.length-1]);
        }else if(K==1){
            System.out.println(max);
        }else{
            PriorityQueue<Integer> Q = new PriorityQueue<Integer>(Collections.reverseOrder());
            for (int i = K; i < N; i++) {
                Q.offer(arr[i] - arr[i - K]);
            }
            Q.offer(arr[K - 1]);
//        System.out.println(Q.size());
            System.out.println(Q.poll());
        }
    }
}
