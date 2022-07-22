package SelfStudying;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dijkstra {
    static class Node{
        int vertex;
        Node rink;
        int weight;

        public Node(int vertex, int weight,Node rink){
            this.vertex = vertex;
            this.weight = weight;
            this.rink = rink;
        }

    }
    // problem boj 1753 최단경로
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int V, E;
        StringTokenizer st = new StringTokenizer(in.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        // 정점 1부터 시작!
        int i = Integer.parseInt(in.readLine());
        int[] minEdge = new int[V+1];
        minEdge[0] = Integer.MAX_VALUE;
        Node[] adjList = new Node[V+1];

        for(int j=1;j<=V;j++){
            int start, end, weight;
            st = new StringTokenizer(in.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            weight = Integer.parseInt(st.nextToken());
            adjList[start] = new Node(end, weight, adjList[start]);
            adjMatrix[start][end] = weight;
            minEdge[j] = Integer.MAX_VALUE;
        }

        boolean[] visited = new boolean[E+1];
        visited[0] = true;
        minEdge[i] = 0;
        int min = 0;
        for (int k = 0; k < V ; k++) {
            int minValue=Integer.MAX_VALUE;
            for(int j=1; j<=V; j++){
                if(!visited[j] && minValue>minEdge[j]){
                    minValue = minEdge[j];
                    min = j;
                }
            }

            visited[min] = true;
            for (int j = 1; j <=V ; j++) {
                if(adjMatrix[min][j]!=0 && minEdge[j] > minEdge[min] + adjMatrix[min][j]){
                    minEdge[j] = minEdge[min] + adjMatrix[min][j];
                }
            }
        }
        StringBuilder sb= new StringBuilder();
        for (int j = 1; j <= V ; j++) {
            if(minEdge[j] == Integer.MAX_VALUE) sb.append("INF").append("\n");
            else sb.append(minEdge[j]).append("\n");
        }
        System.out.println(sb.toString());

    }
}
