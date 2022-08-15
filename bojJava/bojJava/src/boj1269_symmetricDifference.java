import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class boj1269_symmetricDifference {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Map<Integer, Boolean> map = new HashMap<>();
        st = new StringTokenizer(in.readLine());
        for (int i = 0; i < a; i++) {
            int n = Integer.parseInt(st.nextToken());
            map.put(n, true);
        }

        st= new StringTokenizer(in.readLine());
        for (int i = 0; i < b; i++) {
            int n = Integer.parseInt(st.nextToken());
            if(map.get(n)==(null)){
                map.put(n,true);
            }
            else{
                map.put(n, false);
            }
        }

        int cnt = 0;
        for(int key:map.keySet()){
            if(map.get(key)){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
