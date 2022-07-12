import java.util.ArrayList;
import java.util.Scanner;

public class boj11729_HanoiTower {
    static ArrayList<String> arrayList = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hanoi(sc.nextInt(),1,2,3);
        StringBuilder sb = new StringBuilder();
        sb.append(arrayList.size()).append("\n");
        for(String s: arrayList){
            sb.append(s).append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb.toString());
    }

    public static void hanoi(int n,int start, int temp, int target){
        if(n==0) return;
        hanoi(n-1, start, target, temp);
        arrayList.add(start+" "+target);
        hanoi(n-1,temp,start,target);
    }
}

//    private static void hanoi(int n, int start, int temp, int dest){
//
//        if(n==0) return;
//        // 자신의 위쪽의 n-1개 원판 들어내기 : 임시기둥으로 옮기기
//        hanoi(n-1, start, dest, temp);
//        // 자신의 원판 옮기기 : 목적기둥
//        System.out.println(n + " : " + start + " > " + dest);
//        // 들어냈던 임시기둥의 n-1개 원판 자신위에 쌓기 : 목적기둥으로 옮기기
//        hanoi(n-1, temp, start, dest);
//    }
//
//    public static void main(String[] args) {
//        hanoi(10, 1, 2, 3);
//    }
//}
//
