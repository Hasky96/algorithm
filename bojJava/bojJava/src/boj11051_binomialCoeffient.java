import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11051_binomialCoeffient {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(input.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        if(K==0 || N==K || K==1){
            System.out.println(1);
            return;
        }
        int tmp = fact(N)/(fact(N-K)*fact(K));
        System.out.println(tmp%10007);
    }

    public static int fact(int n){
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }
}
