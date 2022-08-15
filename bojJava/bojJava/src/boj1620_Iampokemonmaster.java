import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class boj1620_Iampokemonmaster {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int M = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        String[] dogam = new String[M];
        Map<String, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < M; i++) {
            String poke = in.readLine();
            dogam[cnt] = poke;
            map.put(poke, ++cnt);
        }

//        System.out.println(Arrays.toString(dogam));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            String q = in.readLine();
            try {
                int no = Integer.parseInt(q);
                sb.append(dogam[no-1]);
            }catch (Exception e){
                sb.append(map.get(q));
            }
            finally {
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
