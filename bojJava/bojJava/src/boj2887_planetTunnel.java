import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj2887_planetTunnel {

//    public static void main(String[] args) throws IOException {
//
//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(input.readLine());
//
//        Planet[] arr = new Planet[N];
//        boolean[] visited = new boolean[N];
//
//
//        StringTokenizer st = null;
//        for (int i = 0; i < N; i++) {
//
//            st = new StringTokenizer(input.readLine());
//            arr[i] = new Planet(Integer.parseInt(st.nextToken())
//                        ,Integer.parseInt(st.nextToken())
//                        ,Integer.parseInt(st.nextToken()));
//        }
//
//        int minEdge[] = new int[N];
//        int adjMat[][] = new int[N][N];
//
//        for (int i = 0; i < N; i++) {
//            minEdge[i] = Integer.MAX_VALUE;
//            for (int j = 0; j < N; j++) {
//                adjMat[i][j] =arr[j].distanceFrom(arr[i]);
//            }
//        }
//
//        arr = null;
////        System.out.println(Arrays.deepToString(adjMat));
//
//        int result = 0;
//        minEdge[0] = 0;
//        int min;
//        for(int i=0;i<N;i++){
//            // 1. 신장트리에 포함되지 않은 정점 중 최소간선비용의 정점 찾기
//             min= Integer.MAX_VALUE;
//            int minVertex = -1;
//            for(int j=0;j<N;j++){
//                if(!visited[j] && min>minEdge[j]) {
//                    min = minEdge[j];
//                    minVertex = j;// 정점 번호
//                }
//            }
//            visited[minVertex] = true;  // 신장트리에 포함
//            result += min; //간선비용 누적
//            // 2. 선택된 정점 기준으로 신장트리에 연결되지 않은 타 정점과의 간선 비용 최소로 업데이트
//            for(int j=0;j<N;j++){
//                if(!visited[j]  && minEdge[j] > adjMat[minVertex][j]){// && adjMat[minVertex][j] != 0
//                    minEdge[j] = adjMat[minVertex][j];
//                }
//            }
//        }
//        System.out.println(result);
//    }
//
//    public static class Planet{
//        private int x,y,z;
//
//        public Planet(int x, int y, int z){
//            this.x = x;
//            this.y = y;
//            this.z = z;
//        }
//
//        public int getX() {
//            return x;
//        }
//
//        public int getY() {
//            return y;
//        }
//
//        public int getZ() {
//            return z;
//        }
//
//        public int distanceFrom(Planet fr){
//            if(fr==this) return 0;
//            return Math.min(Math.min(Math.abs(this.x-fr.getX()), Math.abs(this.y-fr.getY())), Math.abs(this.z-fr.getZ()));
//        }
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(input.readLine());

        int[] x= new int[N];
        int[] y= new int[N];
        int[] z= new int[N];



        boolean[] visited = new boolean[N];
        int minEdge[] = new int[N];

        int adjMat[][] = new int[N][N];

        StringTokenizer st = null;
        for (int i = 0; i < N; i++) {

            st = new StringTokenizer(input.readLine());
            x[i]= Integer.parseInt(st.nextToken());
            y[i]= Integer.parseInt(st.nextToken());
            z[i]= Integer.parseInt(st.nextToken());
        }


        for (int i = 0; i < N; i++) {
            minEdge[i] = Integer.MAX_VALUE;
            for (int j = 0; j < N; j++) {
                adjMat[i][j] = Math.min(Math.min(Math.abs(x[i]-x[j]), Math.abs(y[i]-y[j])), Math.abs(z[i]-z[j]));
            }
        }

//        System.out.println(Arrays.deepToString(adjMat));

        int result = 0;
        minEdge[0] = 0;
        int min;
        for(int i=0;i<N;i++){
            // 1. 신장트리에 포함되지 않은 정점 중 최소간선비용의 정점 찾기
             min= Integer.MAX_VALUE;
            int minVertex = -1;
            for(int j=0;j<N;j++){
                if(!visited[j] && min>minEdge[j]) {
                    min = minEdge[j];
                    minVertex = j;// 정점 번호
                }
            }
            visited[minVertex] = true;  // 신장트리에 포함
            result += min; //간선비용 누적
            // 2. 선택된 정점 기준으로 신장트리에 연결되지 않은 타 정점과의 간선 비용 최소로 업데이트
            for(int j=0;j<N;j++){
                if(!visited[j]  && minEdge[j] > adjMat[minVertex][j]){// && adjMat[minVertex][j] != 0
                    minEdge[j] = adjMat[minVertex][j];
                }
            }
        }
        System.out.println(result);
    }
}
