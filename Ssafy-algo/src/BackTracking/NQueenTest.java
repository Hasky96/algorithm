package BackTracking;

import java.util.Arrays;
import java.util.Scanner;


// 같은 행에 두지 않는다.
// 퀸을 위협적이게 않게 놓는 모든 경우의 수
public class NQueenTest  {

    private static int N, cnt;
    private static int[] col;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        cnt = 0;
        col = new int[N+1];
        setQueens(1);
        System.out.println(cnt);
    }

    public static void setQueens(int rowNo){
        if(!isAvailable(rowNo-1)) return;

        if(rowNo > N){
            System.out.println(Arrays.toString(col));
            cnt++;
            return;
        }
        // 1열부터 N열까지 놓아보기
        // 놓았으면 다음 퀸 놓으러 가기
        for(int i =1;i<=N;i++){
            col[rowNo] = i;
            setQueens(rowNo+1);
        }


    }

    public static boolean isAvailable(int rowNo) {

        for(int k = 1 ; k < rowNo; k++){// K : 이전퀸
            if(col[rowNo] == col[k] || Math.abs(col[rowNo]-col[k]) == (rowNo-k)) return false;
        }
        return true;
    }
}
