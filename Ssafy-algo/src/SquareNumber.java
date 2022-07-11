import java.util.Scanner;

public class SquareNumber {

    static int callCnt;
    public static long exp1(long x, long y){
        callCnt++;
        if(y==1) return x;
        return exp1(x, y-1) * x;
    }

    public static long exp2(long x, long y){
        callCnt++;
        if(y==1) return x;

        long r = exp2(x,y/2);
        long res = r*r;

        if(y%2==1) res *= x;
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(exp2(x,y));
        System.out.println(callCnt);
    }
}
