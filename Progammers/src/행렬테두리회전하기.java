import java.util.Arrays;

public class 행렬테두리회전하기 {
    static int[][] table;
    public static void main(String[] args) {
        int rows = 100;
        int columns = 97;
        int[][] queries ={{1,1,100,97}};
        System.out.println(Arrays.toString(solution(rows, columns, queries)));
    }

    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        table = new int[rows+1][columns+1];
        int num = 1;
        for(int i= 1;i <=rows;i++){
            for(int j=1;j<=columns;j++){
                table[i][j] = num++;
            }
        }
        for(int i=0;i< queries.length;i++){
            answer[i] = rotate(queries[i]);
        }
        return answer;
    }

    public static int rotate(int[] query){
        int min = table[query[0]][query[1]];
        int se = query[2]-query[0];
        int ga = query[3]-query[1];
        // 오른쪽 아래 왼쪽 위쪽 방향을 모두 순회 하면서 확인
        // 달팽이 문제와 유사
        //right
        int temp = table[query[0]][query[3]];
        int c1= query[3];
        for(int i = 0; i< ga;i++){
            table[query[0]][c1--]= table[query[0]][c1];
            if(min>table[query[0]][c1]) min=table[query[0]][c1];
        }
        //down
//      System.out.println(Arrays.deepToString(table));
        int temp2 = table[query[2]][query[3]];
        c1= query[2] ;
        for(int i = 0; i < se-1;i++){
            table[c1--][query[3]]= table[c1][query[3]];
            if(min>table[c1][query[3]]) min=table[c1][query[3]];
        }
        table[query[0]+1][query[3]] = temp;

        //left
        int temp3 = table[query[2]][query[1]];
        c1= query[1] ;

        for(int i = 0; i < ga-1;i++){
            table[query[2]][c1++]= table[query[2]][c1];
            if(min>table[query[2]][c1]) min=table[query[2]][c1];
        }
        table[query[2]][query[3]-1] = temp2;

        //up
        c1= query[0] ;
        for(int i = 0; i < se-1;i++){
            table[c1++][query[1]]= table[c1][query[1]];
            if(min>table[c1][query[1]]) min=table[c1][query[1]];
        }
        table[query[2]-1][query[1]] = temp3;
//        System.out.println(Arrays.deepToString(table));

        if(min>temp) min = temp;
        if(min>temp2) min = temp2;
        if(min>temp3) min = temp3;

        return min;
    }
}
