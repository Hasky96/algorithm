import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2511_cardPlay {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] cardA = in.readLine().split(" ");
        String[] cardB = in.readLine().split(" ");

        String roundWinner = "";
        int sumA=0,sumB=0;
        for (int i = 0; i <10 ; i++) {
            int A = Integer.parseInt(cardA[i]);
            int B = Integer.parseInt(cardB[i]);
            if(A>B){
                sumA+=3;
                roundWinner = "A";
            } else if(A<B){
                sumB+=3;
                roundWinner = "B";
            } else{
                sumA++;
                sumB++;
            }

        }
        System.out.println(sumA+" "+sumB);
        if(sumA==sumB){
            if(roundWinner.equals("")) System.out.println("D");
            else System.out.println(roundWinner);
        }else{
            System.out.println(sumA>sumB?"A":"B");
        }
    }
}
