import java.util.*;

public class 문제3 {

    static ArrayList<ArrayList> arr;
    static int end;
    static int[][] map;

    public static void main(String[] args) {
        int[][] edge = {{0,1},{1,2},{2,3},{4,0},{5,1},{6,1},{7,2},{7,3},{4,5},{5,6},{6,7}};
        int n = 8;
        int k = 4;
        int a = 0;
        int b = 3;
        System.out.println(solution(n,edge,k,a,b));
    }

    public static int solution(int n, int[][] edges, int k, int a, int b) {
        int answer = 0;
        map = new int[n][n];
        for(int[] co: edges){
            map[co[0]][co[1]] = 1;
        }
        end = b;
        arr= new ArrayList<ArrayList>();
        boolean[] z = new boolean[n];
        ArrayList<Integer> way = new ArrayList();
        dfs(a, k, z, way);
//        System.out.println(arr);
        return answer;
    }

    public static void dfs(int j, int cut, boolean[] visited, ArrayList<Integer> way) {
        System.out.println(j);
        way.add(j);
        visited[j] = true;
        if (j == end) {
            arr.add(way);
//            System.out.println(way);
            return;
        }
        if (cut < 0) {
            return;
        }
        for (int u = 0; u < map[j].length; u++){
            if (map[j][u] == 1 && !visited[u]){
                dfs(u,cut-1,Arrays.copyOf(visited, visited.length),Collections.copy(way););
            }
        }
    }
}
