import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class boj9375_fashionKingShinHaebin {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(input.readLine());

        while(T-->0){

            int n = Integer.parseInt(input.readLine());
            Map<String, Integer> map = new HashMap();
            StringTokenizer st = null;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(input.readLine());
                st.nextToken();
                String category = st.nextToken();
                map.put(category, map.getOrDefault(category, 0)+1);
            }
            int cnt = 1;
            if(map.size() == 0){
                System.out.println(0);
                continue;
            }
            for(int value : map.values()){
                cnt*=value+1;
            }
            System.out.println(--cnt);
        }

    }
}
