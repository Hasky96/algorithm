import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1934_CommonMultiple {

    public static void main(String[] args) throws IOException {

        BufferedReader input= new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(input.readLine());

        loop1 : while(T-->0){
            StringTokenizer st = new StringTokenizer(input.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());


            int b = (n1>n2?n1:n2);
            int s = (n1<n2?n1:n2);

            if(b%s==0){
                System.out.println(b);
                continue loop1;
            }
            int cm = b*s;
            int ans = cm;
            for (int i = 2; i <s; i++) {
                int tmp = cm/i;
                if(tmp%b==0 && tmp%s==0 && tmp>=b){
                    ans = tmp;
                }
            }
            System.out.println(ans);
        }
    }
}
