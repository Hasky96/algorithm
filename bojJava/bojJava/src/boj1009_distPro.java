import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1009_distPro {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = {{1},
                {2, 4, 8 ,6},
                {3, 9, 7 ,1},
                {4, 6},
                {5},
                {6},
                {7, 9, 3 ,1},
                {8, 4, 2 ,6},
                {9, 1},
                {10}};
        int N = Integer.parseInt(input.readLine());
        while(N-->0){
            StringTokenizer st = new StringTokenizer(input.readLine());
            int a = Integer.parseInt(st.nextToken());
            a = a%10==0?10:a%10;
            int b = Integer.parseInt(st.nextToken());
            int idx = b% arr[a-1].length;
            System.out.println(arr[a-1][idx-1<0?arr[a-1].length-1:idx-1]);
        }
    }
}

//2 4 8 6 2
//3 9 7 1 3
//4 6 4
//5
//6
//7 9 3 1 7
//8 4 2 6 8
//9 1 9