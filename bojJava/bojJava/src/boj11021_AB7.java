import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11021_AB7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int cnt=1;
        while(N-->0){
            st = new StringTokenizer(br.readLine());
            sb.append("Case #").append(cnt++).append(": ").append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append("\n");
        }
        System.out.println(sb.toString());
    }
}
