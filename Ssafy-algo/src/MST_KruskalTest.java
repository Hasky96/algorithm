import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MST_KruskalTest {
    static int V,E;
    static class Edge implements Comparable<Edge>{
        int start, end, weight;

        public Edge(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }


        @Override
        public int compareTo(Edge o) {
//            return this.weight - o.weight;// 간선 부호 같을때
            return Integer.compare(this.weight, o.weight);
        }
    }

    static int[] parents; // 부모원소 관리

    private static void make(){
        parents = new int[V];
        for(int i=0;i<V;i++){
            parents[i] = i;
        }

    }
    private static int find(int a){
        if(a==parents[a]) return a; // 자신이 대표자
        return parents[a] = find(parents[a]); // 자신이 속한 집합의 대표자를 자신의 부모로 path compression
    }

    private static boolean union(int a, int b){
        int aRoot = find(a);
        int bRoot = find(b);
        if(aRoot == bRoot) return false;

        parents[bRoot] = aRoot;
        return true;
    }

    static Edge[] edgeList;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        edgeList = new Edge[E];
        for(int i=0;i<E;i++){
            st = new StringTokenizer(in.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            edgeList[i] = new Edge(start,end,weight);
        }

        Arrays.sort(edgeList);

        make(); // 모든 정점 각각으로 만듬

        int cnt=0, result =0;
        for(Edge edge:edgeList){
            if(union(edge.start, edge.end)){
                result += edge.weight;
                if(++cnt == V-1) break;
            }
        }
        System.out.println(result);

    }

}

//input
/*
5 10
0 1 5
0 2 10
0 3 8
0 4 7
1 2 5
1 3 3
1 4 6
2 3 1
2 4 3
3 4 1

//output
10
*/