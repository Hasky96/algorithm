import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10952_AB5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(true){
            st = new StringTokenizer(br.readLine());
            int value =Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
            if(value==0) break;
            sb.append(value).append("\n");
        }
        System.out.println(sb.toString());
    }
}
