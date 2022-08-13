import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class boj2750_numSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        TreeSet<Integer> tree = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            tree.add(sc.nextInt());
        }

        for (int i = 0; i < N; i++) {
            System.out.println(tree.pollFirst());
        }
    }
}
