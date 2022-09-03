import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class boj1037_divisor {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(input.readLine());
        TreeSet<Integer> tree = new TreeSet<>();

        StringTokenizer st = new StringTokenizer(input.readLine());
        for (int i = 0; i < N; i++) {
            tree.add(Integer.parseInt(st.nextToken()));
        }

        System.out.println(tree.first()*tree.last());
    }
}
