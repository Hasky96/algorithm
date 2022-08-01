import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10773_zero {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(in.readLine());

        Stack<Integer> s = new Stack<Integer>();
        while(N-->0){
            int temp = Integer.parseInt(in.readLine());
            if(temp == 0){
                s.pop();
            }else {
                s.push(temp);
            }
        }
        int sum = 0;
        while(!s.isEmpty()){
            sum += s.pop();
        }
        System.out.println(sum);
    }
}
