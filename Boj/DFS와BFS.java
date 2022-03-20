import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class DFS와BFS {
    static ArrayList dfsAns = new ArrayList();
    static ArrayList bfsAns = new ArrayList();
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        N = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);
        int V = Integer.parseInt(temp[2]);
        int[][] arr = new int[N+1][N+1];
        for(int i=1; i<=M;i++){
            temp = br.readLine().split(" ");
            arr[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])] = 1;
            arr[Integer.parseInt(temp[1])][Integer.parseInt(temp[0])] = 1;
        }
        DFS(arr, V, 0);
        dfsAns.stream().forEach(x-> System.out.print(x+" "));
        System.out.println();
        BFS(arr, V, 0, new int[1000]);
    }

    public static void DFS(int[][] arr,int start, int cnt){
        dfsAns.add(start);
        if(dfsAns.size() == N+1) {
        }
        else {
            for (int i = 1; i <= N; i++) {
                if (arr[start][i] == 1 && !dfsAns.contains(i)) {
                    DFS(arr, i, ++cnt);
                }
            }
        }
    }

    public static void BFS(int[][] arr, int start, int cnt, int[] ans){
        if(cnt == N){
            Arrays.stream(ans).forEach(x-> bfsAns.add(x));
        }else {
            ans[cnt] = start;
            ArrayList Q = new ArrayList();
            for (int i = 1; i <= N; i++) {
                if (arr[start][i] == 1 && !Q.contains(i)) {
                    Q.add(i);
                }
            }
            for (int i = 0; i < Q.size(); i++) {
                BFS(arr, (int) Q.get(i), cnt + 1, ans);
            }
        }
    }
}

