package programmersTest;

import java.util.Arrays;
import java.util.Collection;

public class Q3 {

    static int[] answer={100,-1};
    static int[][] map;
    static boolean[][] visited;
    static int R;
    static int C;

    public static void main(String[] args) {
        int rows = 5;
        int columns = 6;
        int[][] lands = {{2,2},
                {2,3},
                {2,4},
                {3,2},
                {3,5},
                {4,3},
                {4,4},
        };
        System.out.println(Arrays.toString(solution(rows,columns,lands)));
    }

    public static int[] solution(int rows, int columns, int[][] lands) {
        R = rows;
        C = columns;
        visited = new boolean[rows][columns];
        map = new int[rows][columns];
        for(int[] arr:lands){
            map[arr[0]][arr[1]] = 1;
        }
        for(int i=1; i<rows-1; i++){
            for(int j = 1; j<columns-1;j++){
                if(map[i][j]==0&&!visited[i][j]){
                    dfs(1, i, j);
                }
            }
        }
        if(answer[0]==100) answer[0] = -1;
        return answer;
    }

    public static void dfs(int size,int x, int y){
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        visited[x][y] = true;
        for(int i = 0; i < 4; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(1<nx&& nx<R && 1<ny&&ny<C&&map[nx][ny]==0&&!visited[nx][ny]){
                dfs(size+1,nx,ny);
            }
        }
    }
}
