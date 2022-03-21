import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class DFS와BFS {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);
        int V = Integer.parseInt(temp[2]);
        int[][] arr = new int[N+1][N+1];
        for(int i=0; i<M;i++){
            temp = br.readLine().split(" ");
            arr[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])] = 1;
            arr[Integer.parseInt(temp[1])][Integer.parseInt(temp[0])] = 1;
        }
        String dfsAns = dfs(N, arr, V);
        String bfsAns = bfs(N, arr, V);
        System.out.println(dfsAns);
        System.out.println(bfsAns);
    }

    public static String dfs(int size, int[][] arr, int start){
      String ans = "";
      Stack<Integer> stack = new Stack<>();
      stack.push(start);
      int[] visited = new int[size+1];
      while(!stack.isEmpty()){
          int temp = stack.peek();
          visited[temp] = 1;
          for(int i = 1 ; i<=size;i++){
              if(visited[i]==0 && arr[temp][i]==1){
                  temp=i;
                  stack.push(temp);
                  break;
              }
              if(i==size){
                  stack.pop();
              }
          }
      }
      return ans;
    }

    public static String bfs(int size, int[][] arr, int start){
        String ans = "";
        Queue<Integer> Q = new LinkedList<>();
        int[] visited = new int[size+1];
        Q.add(start);
        while(!Q.isEmpty()){
            int temp = Q.poll();
            if (visited[temp] == 0){
                ans += temp + " ";
            }
            visited[temp] = 1;
            for(int i = 1; i<= size ; i++){
                if(visited[i] == 0 && arr[temp][i] == 1 && !Q.contains(i)){
                    Q.add(i);
                }
            }
        }
        return ans;
    }
}

