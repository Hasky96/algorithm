import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10951_AB4 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while(true){
            try{
                st = new StringTokenizer(br.readLine());
                sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())).append("\n");
            }catch (Exception e){
                System.out.println(sb.toString());
                break;
            }
        }
    }
    // charater 0 = 48 => char 1 - 48 => int 1
}
