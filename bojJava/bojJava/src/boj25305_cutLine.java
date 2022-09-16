import java.util.PriorityQueue;
import java.util.Scanner;

public class boj25305_cutLine {

    public static void main(String[] args) {
        PriorityQueue<Integer> scores = new PriorityQueue<>();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < N; i++) {
            scores.add(sc.nextInt());
        }
        int ans = 0;
        for (int i = 0; i <= N-k; i++) {
            ans = scores.poll();
        }

        System.out.println(ans);
    }
}
