import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj5086_multipleFactor {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(in.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            if(num1 == 0 && num2 == 0) break;

            if(num1%num2 == 0) sb.append("multiple").append("\n");
            else if(num2%num1 == 0) sb.append("factor").append("\n");
            else sb.append("neither").append("\n");
        }
        System.out.println(sb.toString());
    }
}
