
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1358_hockey {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(in.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

        // 1. 사각형 부분 안에 있은 경우 xValue <= x && yValue <= y
            if( X <= x && x <= X+W && Y <= y && y <= Y+H){
//                System.out.println(x+" "+Y);
                cnt++;
                continue;
            }

        // 왼쪽 반원에 있는 경우 => 중점과의 거리가 반지름보다 작거나 같다면 내부에 있다. && 왼쪽에 있다 => xValuy<=x
            if(x <= X && isIn(X, Y+H/2, H/2, x, y)){
//                System.out.println(x+" "+Y);
                cnt++;
                continue;
            }

        // 오른쪽에 있는 경우
            if(x >= X+W && isIn(X+W, Y+H/2, H/2, x, y)){
//                System.out.println(x+" "+Y);
                cnt++;
                continue;
            }
//            System.out.println(x+" "+y + " Not in");
        }
        System.out.println(cnt);
    }

    // 원안에 있는지?
    public static boolean isIn(int rx, int ry, int r, int x, int y){
        //거리
        if(Math.pow(rx-x, 2) + Math.pow(ry-y, 2) <= Math.pow(r,2)) return true;
        return false;
    }
}
