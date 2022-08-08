import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj2108_statistics {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(in.readLine());
        TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>();
        int arr[] = new int[N];
        int total = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(in.readLine());
            arr[i] = num;
            total += num;
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        // 1 산술평균
        System.out.println(Math.round(total/(float)N));
        // 2 중앙값 => 반드시 홀수
        Arrays.sort(arr);
        System.out.println(arr[N/2]);
        // 3 최빈값
        Integer[] values = map.values().toArray(new Integer[0]);
        Arrays.sort(values, Comparator.reverseOrder());
        int max = values[0];

        int cnt = 0;
        int maxKey = 0;
        for(int key: map.keySet()){
            if(map.get(key) == max){
                maxKey = key;
                if(++cnt==2){
                    break;
                }
            }
        }
        System.out.println(maxKey);
        // 4 범위
        System.out.println(map.lastKey()-map.firstKey());
    }
}
