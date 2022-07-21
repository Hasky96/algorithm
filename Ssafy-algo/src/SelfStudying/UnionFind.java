package SelfStudying;

import java.util.Arrays;

public class UnionFind {

    //UnionFind => Disjoint-Set ( 서로소 집합 )

    static int size;
    static int[] rep;

    static void make(){
        rep = new int[size];
        for(int i=0; i<size; i++){
            rep[i] = i;
        }
    }

    static int find(int idx){
        if(rep[idx]==idx) return idx; // => 자신이 대표
        return rep[idx] = find(rep[idx]); // 자신이 속한 집합의 대표자를 자신의 부모로 => path compression
    }

    static boolean union(int a, int b){
        int rootA, rootB;
        rootA = find(a);
        rootB = find(b);
        if(rootA == rootB) return false;
       rep[rootB] = rootA;
       return true;
    }

    public static void main(String[] args) {
        size = 5;
        make();
        System.out.println(Arrays.toString(rep));
        union(0,1);
        System.out.println(Arrays.toString(rep));
        union(1, 4);
        System.out.println(Arrays.toString(rep));
        System.out.println(find(4));
    }
}
