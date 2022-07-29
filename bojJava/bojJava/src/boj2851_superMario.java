import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2851_superMario {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = 10;
        int prev=0, now=0;
        while(N-->0){
            prev = now;
            now = prev + Integer.parseInt(in.readLine());
            if(now >= 100) break;
        }
//        if(prev+now==200) System.out.println(now);
        System.out.println(100-prev < now-100?prev:now);

    }

}
