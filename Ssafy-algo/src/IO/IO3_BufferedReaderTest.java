package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IO3_BufferedReaderTest {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String str = in.readLine();
//        char ch[] = str.toCharArray();
//        for(char c: ch){
//            System.out.println(c);
//        }

        //4
        //1 2 3 5

        int n = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        while(n-- > 0){ // nė² ėģź°
            int value = Integer.parseInt(st.nextToken());
            System.out.println(value);
        }
    }
}
