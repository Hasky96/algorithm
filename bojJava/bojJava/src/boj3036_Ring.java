import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj3036_Ring {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(input.readLine());
        StringTokenizer st = new StringTokenizer(input.readLine());

        int rotation = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N-1; i++) {
            System.out.println(solution(rotation, Integer.parseInt(st.nextToken())));
        }

    }

    private static String solution(int rotation, int ring){

        for (int i = ring; i > 0; i--) {
            if(ring%i==0 && rotation%i==0){
                ring /= i;
                rotation /= i;
            }
        }


        String ret = rotation+"/"+ring;
        return ret;
    }
}
