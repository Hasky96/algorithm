package SelfStudying;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prim {


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        int[][] adjMatrix = new int[N][N];
        boolean[] visited = new boolean[N];
        int[] minEdge = new int[N];
        StringTokenizer st;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(in.readLine()," ");
            for(int j=0; j<N; j++){
                adjMatrix[i][j] = Integer.parseInt(st.nextToken());;
            }
            minEdge[i] = Integer.MAX_VALUE; // 최소 비용 간선 초기화
        }
        //0 번 정점 선택
        minEdge[0] = 0;
        int result = 0;
        for(int i=0; i<N; i++){ // N번 반복 => N회 찾음
            int min=Integer.MAX_VALUE, minVertex=0;
            for(int j=0; j<N;j++){// 최소 정점 수색
                if(!visited[j]&& min>minEdge[j]){
                    minVertex = j;
                    min = minEdge[j];
                }
            }
            visited[minVertex] = true;
            result += min;

            for(int j=0; j<N; j++){
                if(!visited[j] && adjMatrix[minVertex][j]!=0 && minEdge[j]>adjMatrix[minVertex][j]){
                    minEdge[j] = adjMatrix[minVertex][j];
                }
            }
        }
        System.out.println(result);

    }
}


//input
/*
5
0 5 10 8 7
5 0 5 3 6
10 5 0 1 3
8 3 1 0 1
7 6 3 1 0

out : 10

7
0 32 31 0 0 60 51
32 0 21 0 0 0 0
31 21 0 0 46 0 25
0 0 0 0 35 18 0
0 0 46 34 0 40 51
60 0 0 18 40 0 0
51 0 25 0 51 0 0

out : 175

*/