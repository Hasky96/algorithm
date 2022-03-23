import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class DFS스페셜저지{
    static String ret = "0";
    static String answer;
    static String ans = "1 ";
    static int depth = 1;
    static int N;
    static boolean[] visited;
    static ArrayList<ArrayList> arr = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N+1];
        for(int i = 0 ; i <= N ; ++i) arr.add(new ArrayList<>());
        for(int i = 1 ; i<N; i++){
            String[] temp = br.readLine().split(" ");
            arr.get(Integer.parseInt(temp[0])).add(Integer.parseInt(temp[1]));
            arr.get(Integer.parseInt(temp[1])).add(Integer.parseInt(temp[0]));
        }
        answer = br.readLine()+ " ";
        dfs(1);
        System.out.println(ret);
    }
    public static int dfs(int start){
        if(depth == N){
            System.out.println(ans);
            depth = 1;
            ans = "1 ";
            visited = new boolean[N+1];
            visited[1] = true;
        }
        visited[start] = true;
        System.out.println(ans);
        if(answer.equals(ans)){
            ret = "1";
        }
        else{
            for(int i = 1;i<=N;i++){
                if(!visited[i] && arr.get(start).contains(i)){
                    ans += i + " ";
                    depth += 1;
                    dfs(i);

                }
            }
        }
        return 0;
    }
}