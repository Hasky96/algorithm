package programmersTest;

import java.util.Arrays;

public class Q2 {
    static int[] hori_x = {0,1,0,1,0,-1};
    static int[] hori_y = {1,0,-1,0,1,0};
    static int[] vert_x = {1,0,-1,0,1,0};
    static int[] vert_y = {0,1,0,1,0,-1};
    static int[] x;
    static int[] y;


    static int d = 0;
    static int dist = 1;
    static int num = 1;
    static int[][] answer;
    static int[] now = {0,0};
    static int n;
    public static void main(String[] args) {
        n = 5;
        boolean horizontal = false;
        System.out.println(Arrays.deepToString(solution(n, horizontal)));
    }

    public static int[][] solution(int n, boolean horizontal) {
        answer = new int[n][n];
        if(horizontal){
            x=hori_x;
            y=hori_y;
        }else{
            x=vert_x;
            y=vert_y;
        }
        answer[0][0] = num++;
        move();
        return answer;
    }

    public static void move(){

        // move 1
        d= d%6;
        now[0] += x[d];
        now[1] += y[d];
        answer[now[0]][now[1]]=num++;
        d++;
        // size move
        for(int j = 0 ; j < 2; j++){
            for(int i = 0; i< dist;i++){
                now[0] += x[d];
                now[1] += y[d];
                answer[now[0]][now[1]]=num++;
            }
            d++;
        }
        dist++;
        if(now[0]==n-1 || now[1]==n-1){
            return;
        }
        move();
    }
}
