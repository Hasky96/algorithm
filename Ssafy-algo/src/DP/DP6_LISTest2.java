package DP;

import java.util.Arrays;
import java.util.Scanner;

public class DP6_LISTest2 {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N]; // 모든 원소의 값은 다르다
        int[] LIS = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int size =0; // LIS 에 채워진 원소수
        for (int i = 0; i < N; i++) {
             int temp = Math.abs(Arrays.binarySearch(LIS, 0, size, arr[i]))-1;
             LIS[temp] = arr[i];

             if(temp == size) size++;

        }
        System.out.println(size);
    }
}
