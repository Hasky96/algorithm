import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1247_buho {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int T = 3;

        while(T-->0){
            int N = Integer.parseInt(input.readLine());

            Long total = 0L;
            for (int i = 0; i < N; i++) {
                total += Long.valueOf(input.readLine());
            }
            if(total==0L){
                System.out.println("0");
            }else if(total<0L){
                System.out.println("-");
            }else{
                System.out.println("+");
            }
        }

    }
}
