import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class boj10815_numCard {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());

        Map<String, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(in.readLine());
        for (int i = 0; i < N; i++) {
            map.put(st.nextToken(), 1);
        }

        int M = Integer.parseInt(in.readLine());
        st = new StringTokenizer(in.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            sb.append(map.getOrDefault(st.nextToken(), 0)).append(" ");
        }

        System.out.println(sb.toString());
    }
}
