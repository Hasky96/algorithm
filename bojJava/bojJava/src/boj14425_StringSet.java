import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class boj14425_StringSet {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<String> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(in.readLine());
        }

        int cnt=0;
        for (int i = 0; i < M; i++) {
            String str = in.readLine();
            if(arr.contains(str)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
