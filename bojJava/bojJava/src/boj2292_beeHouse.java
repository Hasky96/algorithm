import java.util.Scanner;

public class boj2292_beeHouse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int end_num=1;
        int count=1;
        while(N>end_num){
            end_num += 6*count;
            count++;
        }
        System.out.println(count);
    }

}
