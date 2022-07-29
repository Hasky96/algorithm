import java.util.Scanner;

public class boj1110_plusCycle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int temp = 100;
        int cnt = 0;
        String word = String.valueOf(N);
        while(temp!=N){
            cnt++;
            if(word.length()<2) word = "0"+word;
            temp = ((int)word.charAt(1)-48)*10 + ((int)word.charAt(0)-48 + (int)word.charAt(1)-48)%10 ;
            word = String.valueOf(temp);
        }
        System.out.println(cnt);
    }

}
