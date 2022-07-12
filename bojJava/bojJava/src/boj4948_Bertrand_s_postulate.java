import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj4948_Bertrand_s_postulate {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] pn = new int[123456*2+1];
        pn[0] = 1;
        pn[1] = 1;
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            findPrimeNum(pn, n);
            int cnt = 0;
            for(int i=n+1; i<=2*n ; i++){
                if(pn[i]==0) cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb.toString());

    }

    public static void findPrimeNum(int[] arr, int end){
        end *= 2;
        for(int i = 2;i<=end;i++){
            if(arr[i]==1) continue;
            for(int j = 2; j <= end/i; j++){
                arr[i*j] = 1;
            }
        }
    }
}
