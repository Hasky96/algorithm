import java.util.Scanner;

public class boj1075_divide {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int F = sc.nextInt();

        N = N/100 * 100;

        int k = 0;
        int idx = 1;
        while(k<=N){
            k = F*idx++;
            if(k==N) break;
        }
        String str = String.valueOf(k);
        System.out.println(str.substring(str.length()-2));
    }
}
