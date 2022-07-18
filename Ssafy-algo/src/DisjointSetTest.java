import java.util.Arrays;

public class DisjointSetTest {

    static int N; // 원소개수
    static int[] parents; // 부모원소 관리

    private static void make(){
        for(int i=0;i<N;i++){
            parents[i] = i;
        }

    }
    private static int find(int a){
        if(a==parents[a]) return a; // 자신이 대표자
        return parents[a] = find(parents[a]); // 자신이 속한 집합의 대표자를 자신의 부모로 path compression
    }

    private static boolean union(int a, int b){
        int aRoot = find(a);
        int bRoot = find(b);
        if(aRoot == bRoot) return false;

        parents[bRoot] = aRoot;
        return true;
    }

    public static void main(String[] args) {
        N = 5;
        parents = new int[N];

        // make set
        make();
        System.out.println(union(0, 1));
        System.out.println(Arrays.toString(parents));
        System.out.println(union(2, 1));
        System.out.println(Arrays.toString(parents));
        System.out.println(union(3, 2));
        System.out.println(Arrays.toString(parents));
        System.out.println(union(4, 3));
        System.out.println(Arrays.toString(parents));

        System.out.println("==========find============");
        System.out.println(find(4));
        System.out.println(Arrays.toString(parents));
        System.out.println(find(3));
        System.out.println(Arrays.toString(parents));
        System.out.println(find(2));
        System.out.println(Arrays.toString(parents));
        System.out.println(find(0));
        System.out.println(Arrays.toString(parents));
        System.out.println(find(1));
        System.out.println(Arrays.toString(parents));
    }
}
