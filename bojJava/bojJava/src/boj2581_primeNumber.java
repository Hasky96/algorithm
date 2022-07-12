import java.util.Scanner;

public class boj2581_primeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] pn = new int[M+1];
        pn[0] =1;
        pn[1] =1;

        for(int i = 2;i<M;i++){
            if(pn[i]==1) continue;
            for(int j = 2 ;j<=M/i;j++){
                pn[j*i] = 1;
            }
        }

        int sum=0;
        int min = 0;
        for(int i = N;i<=M; i++){
            if(pn[i]==1) continue;
            if(min==0){
                min = i;
            }
            sum += i;
        }
        System.out.print(sum==0?"":sum +"\n");
        System.out.println(min==0?-1:min);
    }

}
