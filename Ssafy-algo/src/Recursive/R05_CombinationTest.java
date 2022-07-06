package Recursive;

import java.util.Arrays;

public class R05_CombinationTest {

    static int N=5, R=2;
    static int[] input;
    static int[] numbers;

    public static void main(String[] args) {

        input = new int[]{1,4,7,2,5};
        numbers = new int[R];

        combination(0, 0);

    }

    private static void combination(int cnt, int start){
        if(cnt == R){
            System.out.println(Arrays.toString(numbers));
            return;
        }

        for(int i = start ; i<N;i++){

            numbers[cnt] = input[i];
            // 다음순열 선택
            combination(cnt+1, i+1);
        }

    }

}
