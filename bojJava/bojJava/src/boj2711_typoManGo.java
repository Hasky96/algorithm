import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2711_typoManGo {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());

        StringTokenizer st= null;
        while(T-->0){
            st = new StringTokenizer(in.readLine());
            int N = Integer.parseInt(st.nextToken());
            String word = st.nextToken();
            StringBuilder sb = new StringBuilder(word);
            sb.deleteCharAt(N-1);
            System.out.println(sb.toString());
        }
    }

}
