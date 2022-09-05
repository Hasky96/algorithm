import java.util.Arrays;
import java.util.Scanner;

public class boj1676_factorialZeroCnt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;
        while(N>=5){
            cnt+=N/5;
            N/=5;
        }
        System.out.println(cnt);
    }
}
