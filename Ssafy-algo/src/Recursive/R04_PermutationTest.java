package Recursive;

import java.util.Arrays;

public class R04_PermutationTest {

    static int N=5, R=2;
    static int[] input;
    static int[] numbers;
    static boolean[] isSelected;
    public static void main(String[] args) {

        input = new int[]{1,4,7,2,5};
        numbers = new int[R];
        isSelected = new boolean[N];

        permutation(0);

    }

    private static void permutation(int cnt){
        if(cnt == R){
            System.out.println(Arrays.toString(numbers));
            return;
        }

        for(int i = 0 ; i<N;i++){
            if(isSelected[i]) continue;// 사용중이면 다음수

            numbers[cnt] = input[i];
            isSelected[i] = true;

            // 다음순열 선택
            permutation(cnt+1);
            isSelected[i] = false;
        }

    }

}
