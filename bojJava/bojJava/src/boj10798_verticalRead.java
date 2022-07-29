import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10798_verticalRead {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = in.readLine();
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(words[j].length()>i){
                    System.out.print(words[j].charAt(i));
                }
            }
        }

    }
}
