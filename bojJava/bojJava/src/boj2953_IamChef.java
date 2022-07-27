import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2953_IamChef {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = 5;
        int chef = 0;
        int winner = 0;
        int winTot = 0;
        StringTokenizer st= null;
        while(N-->0){
            chef++;
            st = new StringTokenizer(in.readLine());
            int total = 0;
            for (int i = 0; i < 4; i++) {
                total += Integer.parseInt(st.nextToken());
            }

            if(winTot < total){
                winner = chef;
                winTot = total;
            }
        }
        System.out.println(winner+" "+winTot);
    }

}
