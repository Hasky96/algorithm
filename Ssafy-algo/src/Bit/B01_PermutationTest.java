package Bit;

import java.util.Arrays;

public class B01_PermutationTest {

    static int N=5, R=2;
    static int[] input;
    static int[] numbers;

    public static void main(String[] args) {

        input = new int[]{1,4,7,2,5};
        numbers = new int[R];

        permutation(0, 0);

    }

    private static void permutation(int cnt,int flag){
        if(cnt == R){
            System.out.println(Arrays.toString(numbers));
            return;
        }

        for(int i = 0 ; i<N;i++){
            if((flag&1<<i)!=0) continue;
            numbers[cnt] = input[i];
            // 다음순열 선택
            permutation(cnt+1, flag | 1<<i);
        }

    }

}
