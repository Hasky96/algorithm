import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11659_subSum {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        st = new StringTokenizer(input.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }
        while(M-->0){
            st = new StringTokenizer(input.readLine());
            int s = Integer.parseInt(st.nextToken())-2;
            int e = Integer.parseInt(st.nextToken())-1;
            if(s<0) {
                System.out.println(arr[e]);
                continue;
            }
            System.out.println(arr[e]-arr[s]);
        }

    }

}
