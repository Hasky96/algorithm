import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class boj18870_coordinateCompression {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[N];
        TreeSet<Integer> tree = new TreeSet<Integer>();

        StringTokenizer st = new StringTokenizer(in.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            tree.add(num);
        }

        int cnt = tree.size()-1;
        while(!tree.isEmpty()){
            int num = tree.pollLast();
            map.put(num, cnt--);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(map.get(arr[i])).append(" ");
        }
        System.out.println(sb.toString());
    }
}
