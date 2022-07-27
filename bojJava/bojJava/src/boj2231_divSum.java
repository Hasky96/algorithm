import java.util.Scanner;

public class boj2231_divSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i =1; i<N;i++){
            int ds = divSum(i);
            if(ds==N){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }

    public static int divSum(int n){
        int ret = n;
        String strNum = Integer.toString(ret);
        for (char c:strNum.toCharArray()) {
            ret += Integer.parseInt(String.valueOf(c));
        }
        return ret;
    }
}
