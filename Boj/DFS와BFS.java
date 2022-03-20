import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class DFS와BFS {
    static int[] dfsAns;
    static int[] bfsAns;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        N = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);
        int V = Integer.parseInt(temp[2]);
        int[][] arr = new int[N+1][N+1];
        for(int i=0; i<=M;i++){
            temp = br.readLine().split(" ");
            arr[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])] = 1;
        }
        DFS(V, 0);
    }

    public static void DFS(int start, int N){
        for(int i =0;i<=N){

        }
    }


}

