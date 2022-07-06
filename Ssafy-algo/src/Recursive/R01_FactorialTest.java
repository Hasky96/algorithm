package Recursive;

public class R01_FactorialTest {

    //fatorial 반복
    // 1 * 5 * 4 * 3 * 2 * 1
    private static int fatorial0(int n){
        int res = 1;
        for(int i = n ; i>0; i--){
            res *= i;
        }
        return res;
    }

    // 누적을 위해 전역 변수 선언
    private static int res2 = 1;
    //factorial 반복 재귀로 바꿔보기
    private static void fatorial0_2(int i){
        if(i==1) return;
        res2 *= i;
        fatorial0_2(i-1);
    }



    // factorial recursive
    private static int factorial(int n){
        if(n <= 1) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fatorial0(5));
        fatorial0_2(5);
        System.out.println(res2);
    }
}
