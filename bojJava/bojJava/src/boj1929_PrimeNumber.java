import java.util.Scanner;
import java.util.StringTokenizer;

public class boj1929_PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int N= Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        int pn[] = new int[M+1];
        pn[0] = 1;
        pn[1] = 1;
        for(int i = 2;i<=M;i++){
            if(pn[i]==1)continue;
            for(int j = 2;j<=M/i;j++){
                pn[j*i] = 1;
            }
        }

        for(int i = N; i <= M; i++){
            if(pn[i]==0){
                System.out.println(i);
            }
        }
    }
}
