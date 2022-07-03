package problems;

import java.util.*;

public class 프렌즈4블록 {

    public static void main(String[] args) {
        int m =4;
        int n =5;
        String[] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
        System.out.println(solution(m,n,board));
    }


    public static int solution(int m, int n, String[] board) {
        int answer = 0;
        String[][] arr =new String[m][n];
        // 2차원 String 배열로 구성
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                arr[j][i] = String.valueOf(board[j].charAt(i));
            }
        }
        ArrayList<int[]> pung; // 사라지게 될 부분의 좌상단의 좌표
        boolean isGo=true; // 계속 찾을 것인지?
        while(isGo){
            isGo=false;
            pung = new ArrayList<>();
            for(int i=0; i<n-1;i++){
                for(int j=0; j<m-1; j++){
                    //좌상단을 기준으로 4칸이 같으면 사라질 항목에 넣어둠
                    if(!arr[j][i].equals("0")&&arr[j][i].equals(arr[j+1][i]) && arr[j][i].equals(arr[j][i+1]) && arr[j][i].equals(arr[j+1][i+1])){
                        pung.add(new int[]{j, i});
                        isGo = true;
                    }
                }
            }
            // 사라지는 부분 찾아서 "0"으로 바꿈
            for(int[] point:pung){
                int x = point[0];
                int y = point[1];
                arr[x][y] = "0";
                arr[x+1][y]="0";
                arr[x][y+1]="0";
                arr[x+1][y+1]="0";
            }
            // 인덱스를 이용하여 "0"부분을 중력방향으로 지우고 채움
            for(int i = 0;i<n;i++){
                int index = m-1;
                for(int j=m-1;j>=0;j--){
                    if(!arr[j][i].equals("0")){
                        String a = arr[j][i];
                        arr[j][i] = "0";
                        arr[index][i] = a;
                        index--;
                    }
                }
            }
        }
        // "0"의 갯수를 파악해 정답 도출
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                if(arr[j][i].equals("0")){
                    answer+=1;
                }
            }
        }

        return answer;
    }
}
