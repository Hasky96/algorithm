import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj23253_CsIsAwsome {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        st.nextToken();
        int N = Integer.parseInt(st.nextToken());
        String ans = "Yes";

        l1: while(N-->0){
            int size = Integer.parseInt(in.readLine());
            st = new StringTokenizer(in.readLine());
            int temp = 200001;
            for (int i = 0; i < size; i++) {
                int inp = Integer.parseInt(st.nextToken());
                if(inp > temp){
                    ans = "No";
                    break l1;
                }
                temp = inp;
            }
        }
        System.out.println(ans);

    }


}
