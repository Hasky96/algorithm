import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj3052_lefts {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 10;
        int[] arr = new int[48];
        while(n-->0){
            arr[Integer.parseInt(br.readLine())%42]++;
        }
        int cnt = 0;
        for(int i:arr){
            if(i>0) cnt++;
        }
        System.out.println(cnt);

    }
}
