import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2846_slope {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine());

        int[] slope = new int[N];
        for (int i = 0; i < N; i++) {
            slope[i] =  Integer.parseInt(st.nextToken());
        }

        int bot=slope[0], top=0, max=0, temp;
        for (int i = 1; i < N; i++) {
            int now = slope[i];
            if(bot<now && top < now) {
                top = now;
            }else if(top>=now){
                temp =Math.max(max, top-bot);
                max = temp!=0?temp:max;
                bot = now;
                top = now;
            }

        }
        temp =Math.max(max, top-bot);
        max = temp!=0?temp:max;
        System.out.println(max);
    }

}
