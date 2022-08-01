package DP;

import java.util.Arrays;

public class BinarySearchTest {

    public static void main(String[] args) {
        int[] values = {3,11,15,20,21,45};

        System.out.println(Arrays.binarySearch(values, 3)); //0
        System.out.println(Arrays.binarySearch(values, 45)); //5
        System.out.println(Arrays.binarySearch(values, 11)); //1
        System.out.println(Arrays.binarySearch(values, 30)); //-6
        System.out.println(Arrays.binarySearch(values, 1)); //-1
        System.out.println(Arrays.binarySearch(values, 50)); //-7

        System.out.println(Arrays.binarySearch(values, 1, 4, 41)); // 이상 미만 => -5

    }

}

