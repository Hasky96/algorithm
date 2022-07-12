import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2869_snailClimbing {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        // 하루지나고 올라간 거리
        int dpd = A-B;
        // 마지막 올라가기 위한 cut
        int cut = V-A;
        // cut을 넘기까지의 day
        int day = cut/dpd;
        if(day==0) day = 0;
        if(cut%dpd>0) day++;
        System.out.println(++day);
    }
}
