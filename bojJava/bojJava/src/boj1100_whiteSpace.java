import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1100_whiteSpace {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            String str = input.readLine();
            for (int j = 0; j < 8; j++) {
                if(str.charAt(j)=='F'&& (i+j)%2==0){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}

