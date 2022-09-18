import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class boj24040_mergeSorting {

    static int cnt, K;

    public static void main(String[] args) throws IOException {
        cnt=0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(input.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(input.readLine());
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(arr, 0, N-1);
        System.out.println(-1);
    }

    public static void mergeSort(int[] arr, int start, int end){

        if(start < end){
            int q = (start+end)/2;
            mergeSort(arr, start, q);
            mergeSort(arr, q+1, end);
            merge(arr, start, q, end);
        }
    }

    public static void merge(int[] arr, int p, int q, int r){
        int i = p;
        int j = q+1;
        int t = 0;
        int[] tmp = new int[arr.length];

        while(i<=q && j<=r){
            if(arr[i]<arr[j]){
                tmp[t++] = arr[i++];
            }else{
                tmp[t++] = arr[j++];
            }
        }
        while(i<=q){
            tmp[t++] = arr[i++];
        }
        while(j<=r){
            tmp[t++] = arr[j++];
        }
        i = p;
        t = 0;
        while(i<=r){
            int temp = tmp[t++];
            arr[i++] = temp;
            if(++cnt==K){
                System.out.println(temp);
                System.exit(0);
            }
        }

    }


}
