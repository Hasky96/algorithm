import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class DFS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[N+1][N+1];

        boolean[] visited = new boolean[N+1];
        String dfsOrder = "1 ";
        for(int i=1;i<N;i++){
            String[] temp = br.readLine().split(" ");
            arr[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])] = true;
            arr[Integer.parseInt(temp[1])][Integer.parseInt(temp[0])] = true;
//            arr[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])] = 1;
//            arr[Integer.parseInt(temp[1])][Integer.parseInt(temp[0])] = 1;
        }
        String dfsInput = br.readLine() + " ";
        br.close();
        dfs(N, arr, visited, dfsOrder,1);;
        if(!dfsInput.equals(dfsOrder)){
            visited = new boolean[N+1];
            dfsOrder = "1 ";
            dfs2(N, arr, visited, dfsOrder,1);
        }
        System.out.println(dfsInput.equals(dfsOrder)? 1:0);
    }

    public static void dfs(int N, boolean[][] arr, boolean[] visited, String dfsOrder, int start){
        if(dfsOrder.length() < N*2){
            visited[start] = true;
            for(int i = 1; i <= N; i++){
                if(!visited[i] && arr[start][i]){
                    dfsOrder += i + " ";
                    dfs(N, arr, visited, dfsOrder,start);
                }
            }
        }
    }
    public static void dfs2(int N, boolean[][] arr, boolean[] visited, String dfsOrder, int start){
        if(dfsOrder.length() < N*2){
            visited[start] = true;
            for(int i = N; i >= 1; i--){
                if(!visited[i] && arr[start][i]){
                    dfsOrder += i + " ";
                    dfs(N, arr, visited, dfsOrder,start);
                }
            }
        }
    }
}
