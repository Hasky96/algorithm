import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1032_cmd {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(input.readLine());

        char[][] arr = new char[N][];
        for (int i = 0; i < N; i++) {

            arr[i] = input.readLine().toCharArray();
        }

        char[] ans =  arr[0];
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(ans[j]!=arr[i][j]){
                    ans[j]='?';
                }
            }
        }
        for (char c:ans) {
            System.out.print(c);
        }
    }
}
