import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class AdjMatrixTest {

    static int N; // 정점 갯수
    static boolean[][] adjMatrix; // 인접행렬 (가중치 없음)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        adjMatrix = new boolean[N][N];
        int C = Integer.parseInt(br.readLine());// 간선 갯수

        for(int i =0;i<C;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            adjMatrix[from][to] = adjMatrix[to][from] = true;
        }
        System.out.println("==============================bfs=================================");
        bfs();
        System.out.println("==============================dfs=================================");
        boolean[] visited = new boolean[N];
        dfs(0, visited);
    }
    private static void bfs(){

        Queue<Integer> queue = new LinkedList<Integer>();
        boolean[] visited = new boolean[N];

        queue.offer(0);
        visited[0] = true;

        while(!queue.isEmpty()){
            int current = queue.poll();
            System.out.println((char)(current+65));

            for(int i = 0 ; i<N; i++){
                if(!visited[i] // 미방문
                        && adjMatrix[current][i]){ // 인접정점
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
    //재귀
    private static void dfs(int current, boolean[] visited){

        visited[current] = true;
        System.out.println((char)(current+65));

        for(int i=0; i<N; i++){
            if(!visited[i] && adjMatrix[current][i]){
                dfs(i, visited);
            }
        }
    }


}


/* input
7
8
0 1
0 2
1 3
1 4
2 4
3 5
4 5
5 6
*/