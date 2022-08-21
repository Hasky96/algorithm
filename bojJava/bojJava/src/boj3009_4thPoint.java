import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class boj3009_4thPoint {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> x = new HashMap();
        Map<String, Integer> y = new HashMap();
        StringTokenizer st = null;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(in.readLine());
            String xx =st.nextToken();
            x.put(xx, x.getOrDefault(xx, 0) + 1 );
            String yy =st.nextToken();
            y.put(yy, y.getOrDefault(yy, 0) + 1 );
        }

        for(String ax: x.keySet()){
            if(x.get(ax) == 1){
                System.out.print(ax);
                break;
            }
        }
        System.out.print(" ");
        for(String ay: y.keySet()){
            if(y.get(ay) == 1){
                System.out.print(ay);
                break;
            }
        }

    }

}
