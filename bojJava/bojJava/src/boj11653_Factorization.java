import java.util.Scanner;

public class boj11653_Factorization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N==1) return;

        int[] result = new int[N+1];

        while(N>1){
            for(int i=2;i<=N;i++){
                if(N%i==0){
                    N/=i;
                    result[i] += 1;
                    break;
                }
            }
        }
        for(int i=2;i<result.length;i++){
            if(result[i]>0){
                for(int j=0;j<result[i];j++){
                    System.out.println(i);
                }
            }
        }
    }
}
