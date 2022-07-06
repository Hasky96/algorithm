package Example;

import java.util.Arrays;
import java.util.Scanner;

public class diceTest {

    static int N, numbers[], totalCnt;
    static boolean isSelected[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주사위 던질 횟수 : ");
        N = sc.nextInt(); // 주사위 던진 횟수
        numbers = new int[N];
        totalCnt = 0;

        System.out.print("모드 : ");
        int M = sc.nextInt(); // 모드

        switch (M){
            case 1: // 중복순열
                dice1(0);
                break;
            case 2: // 순열
                isSelected = new boolean[7];
                dice2(0);
                break;
            case 3: // 중복조합
                dice3(0, 1);
                break;
            case 4: // 조합
                dice4(0, 1);
                break;
        }
        System.out.println("경우의 수 : " + totalCnt );
    }


    private static void dice1(int cnt){

        if(cnt == N){
            totalCnt++;
            System.out.println(Arrays.toString(numbers));
            return;
        }

        for (int i = 1 ; i <= 6 ; i++){
            numbers[cnt] = i;
            dice1(cnt + 1);
        }
    }

    private static void dice2(int cnt){

        if(cnt == N){
            totalCnt++;
            System.out.println(Arrays.toString(numbers));
            return;
        }

        for (int i = 1 ; i <= 6 ; i++){
            // 중복 체크
            if(isSelected[i]) continue;

            numbers[cnt] = i;
            isSelected[i] = true;
            dice2(cnt + 1);
            isSelected[i] = false;
        }
    }

    private static void dice3(int cnt, int start){

        if(cnt == N){
            totalCnt++;
            System.out.println(Arrays.toString(numbers));
            return;
        }
        for(int i = start; i <= 6; i++){
            numbers[cnt] = i;
            dice3(cnt +1, i);
        }
    }

    private static void dice4(int cnt, int start){

        if(cnt == N){
            totalCnt++;
            System.out.println(Arrays.toString(numbers));
            return;
        }
        for(int i = start; i <= 6; i++){
            numbers[cnt] = i;
            dice4(cnt +1, i+1);
        }
    }

}
