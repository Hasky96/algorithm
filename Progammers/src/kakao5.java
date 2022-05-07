import java.util.*;

public class kakao5 {

    public static void main(String[] args) {
        int[][] rc = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String[] operation = {"Rotate", "ShiftRow"};
        System.out.println(Arrays.deepToString(solution(rc, operation)));
    }

    public static int[][] solution(int[][] rc, String[] operations) {
        int sr = 0;
        int ro = 0;
        for(String oper:operations){
            if(oper.equals("Rotate")){
                shiftRow(rc, sr);
                sr = 0;
                ro ++;
            }else if(oper.equals("ShiftRow")){
                ro %= (rc.length + rc[0].length) * 2 - 4;
                rotate(rc, ro);
                ro = 0;
                sr++;
            }
        }
        System.out.println(sr);
        if(sr!=0){
            shiftRow(rc, sr);
        }else if(ro != 0){
            ro %= (rc.length + rc[0].length) * 2 - 4;
            rotate(rc, ro);
        }
        return rc;
    }

    public static void rotate(int[][] arr, int k){
        int len = (arr.length + arr[0].length) * 2 - 4;
        int[] temp = new int[len];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int dir = 0;
        int x = 0;
        int y = 0;
        for(int i =0;i<len;i++){
            if(0>x && x< arr.length && 0<y && y<arr[0].length){
                temp[i] = arr[x][y];
            }else{
                dir++;
                i--;
            }
        }
        for(int i =0;i<len;i++){
            if(0>x && x< arr.length && 0<y && y<arr[0].length){
                arr[x][y]= temp[(len-k+i)%len];
            }else{
                dir++;
                i--;
            }
        }


//        int garo = arr[0].length;
//        int sero = arr.length;
//        // 제일 윗줄
//        int temp = arr[0][garo-1];
//        for(int i=1; i<garo; i++){
//            arr[0][garo-i] = arr[0][garo-i-1];
//        }
//        // 오른쪽 줄
//        int temp2 = arr[sero-1][garo-1];
//        for(int i = 1; i<sero-1; i++){
//            arr[sero-i][garo-1] = arr[sero-i-1][garo-1];
//        }
//        arr[1][garo-1] = temp;
//        // 아랫 줄
//        temp = arr[sero-1][0];
//        for(int i = 0; i<garo-1;i++){
//            arr[sero-1][i] = arr[sero-1][i+1];
//        }
//        arr[sero-1][garo-2] = temp2;
//        // 왼쪽 줄
//        for(int i = 0 ; i < sero-1;i++){
//            arr[i][0] = arr[i+1][0];
//        }
//        arr[sero-2][0] = temp;
    }

    public static void shiftRow(int[][] arr, int k){
        if(k%arr.length == 0) return;
        int[][] ret = arr.clone();

        for(int i=0;i<arr.length;i++){
            arr[(i+k)%arr.length] = ret[i];
        }
    }
}
