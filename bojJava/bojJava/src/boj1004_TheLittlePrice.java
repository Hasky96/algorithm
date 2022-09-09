import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1004_TheLittlePrice {

    public static void main(String[] args) throws IOException {

        //출발지와 도착지를 포함한 원이 몇개인지 파악하자
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(in.readLine());

        while (T-->0){

            StringTokenizer st = new StringTokenizer(in.readLine());
            int stx = Integer.parseInt(st.nextToken());
            int sty = Integer.parseInt(st.nextToken());
            int edx = Integer.parseInt(st.nextToken());
            int edy = Integer.parseInt(st.nextToken());

            int cnt = 0;
            int N = Integer.parseInt(in.readLine());
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(in.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                // 둘 중 하나만 포함해야 CNT++, 둘다 포함된 경우 벗어나지 않음
                // XOR(^) TF = T , FT = T , TT = F, FF = F
                if(isIn(x,y,r,stx,sty) ^ isIn(x,y,r,edx,edy)){
                    cnt++;
                    continue;
                }
            }
            System.out.println(cnt);

        }

    }

    // 원안에 있는지?
    public static boolean isIn(int rx, int ry, int r, int x, int y){
        //거리
        if(Math.pow(rx-x, 2) + Math.pow(ry-y, 2) <= Math.pow(r,2)) return true;
        return false;
    }
}
