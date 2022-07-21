package SelfStudying;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Kruskal {

    static int V,E;

    static class Edge implements Comparable<Edge>{ // Kruskal 위해 가중치순으로 정렬 가능한 간선 클래스 만듬
        int weight, start, end; // 간선의 시작, 끝, 가중치

        public Edge(int weight, int start, int end) {
            this.weight = weight;
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.weight, o.weight);
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "weight=" + weight +
                    ", start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

    // UnionFind
    static int[] rep;
    public static void make(){
        rep = new int[V];
        for(int i=0;i<V;i++){
            rep[i] = i;
        }
    }

    public static int find(int idx){
        if(idx == rep[idx]) return idx;
        return rep[idx] = find(rep[idx]);
    }

    public static boolean union(int a, int b){
        int rootA = find(a);
        int rootB = find(b);
        if(rootA == rootB) return false;
        rep[rootB] = rootA;
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        Edge[] edges = new Edge[E];
        for(int i=0; i<E; i++){
            st = new StringTokenizer(in.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            edges[i] = new Edge(weight, start, end);
        }
        // 간선정렬
        Arrays.sort(edges);
        // Union-Find 시작
        make();
        int cnt=0, result =0;

        for(int i=0;i<E;i++){// 모든 간선 탐색
            Edge e = edges[i];
            if(union(e.start, e.end)){// Union 생성을 통해 간선 선택여부 확인
                cnt++;
                result+= e.weight; // 가중치 누적
            }
            if(cnt == V-1) break; // 최소 간선 정점-1개 생성되면 종료
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