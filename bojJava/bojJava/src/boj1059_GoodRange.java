import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1059_GoodRange {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(input.readLine());

        StringTokenizer st = new StringTokenizer(input.readLine());

        int n = Integer.parseInt(input.readLine());

        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp == n){
                System.out.println(0);
                return;
            }
            arr[i] = tmp;
        }
        Arrays.sort(arr);
//        System.out.println("arr"+arr[0]+" "+arr[t-1]);
//            System.out.println("exit");

        if(n<arr[0]){
            int cnt = 0;
            for (int i = 1; i <arr[0]-1 ; i++) {
                if(i>n) break;
                for (int j = arr[0]-1; j > i; j--) {
                    if(j<n) break;
                    cnt++;
//                System.out.println(i+" "+j+" "+ cnt);
                }
            }
            System.out.println(cnt);
            return;
        }

        int idx = 0;
        for (int i = 1; i < t; i++) {
            if(arr[i]>n){
                idx = i-1;
                break;
            }
        }

        int start = idx;
        int end = idx+1;
        int cnt = 0;
        for (int i = arr[start]+1; i <arr[end]-1 ; i++) {
            if(i>n) break;
            for (int j = arr[end]-1; j > i; j--) {
                if(j<n) break;
                cnt++;
//                System.out.println(i+" "+j+" "+ cnt);
            }
        }
        System.out.println(cnt);
    }

}
