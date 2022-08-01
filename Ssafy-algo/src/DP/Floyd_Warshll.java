package DP;

public class Floyd_Warshll {

    public static void main(String[] args) {
        int N = 10;

        int[][] D = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i==j) D[i][j] = 0;
                else D[i][j] = Integer.MAX_VALUE ;
            }
        }

        // 간선, 가중치 입력

        //플로이드 와샬
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(i!=j && j!=k && i!=k){
                        D[i][j] = Math.min(D[i][j], D[i][k]+D[k][j]);
                    }
                }
            }
        }


    }


}
