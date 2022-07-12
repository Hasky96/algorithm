import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9020_Goldbach_prediction {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] np = new int[10001];
        np[0] = 1;
        np[1] = 1;
        StringBuilder sb = new StringBuilder();
        loop1: while(T-->0){
            int n = Integer.parseInt(br.readLine());
            int cnt = findPrimeNumber(np, n);
            int idx = cnt-1;
            int[] arr = new int[cnt];
            for(int i = 2;i <= n; i++){
                if(np[i]==0){
                    arr[idx--] = i;
                }
                if(idx==0)break;
            }
            int ii = 0;
            int jj = 0;
            int temp = 20000;
            for(int i = 0; i<cnt;i++){
                for(int j = i; j<cnt;j++){
                    if(arr[i]+arr[j]==n){
                        if((j-i)<temp){
                            temp = j-i;
                            ii = i;
                            jj = j;
                        }
                    }
                }
            }
            sb.append(arr[jj]).append(" ").append(arr[ii]).append("\n");
        }
        System.out.println(sb.toString());

    }
    public static int findPrimeNumber(int[] np, int end){
        int cnt = 0;
        for(int i = 2; i<= end; i++){
            if(np[i]==1)continue;
            cnt++;
            for(int j = 2; j <= end/i;j++){
                np[i*j] = 1;
            }
        }
        return cnt;
    }
}
