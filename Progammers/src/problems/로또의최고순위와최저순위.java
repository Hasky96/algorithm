package problems;

import java.util.*;

public class 로또의최고순위와최저순위 {

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] winNum = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(solution(lottos, winNum)));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int rank[] = {6,6,5,4,3,2,1};
        int[] answer = new int[2];
        ArrayList<Integer> win = new ArrayList(Arrays.asList(win_nums));
        for(Object i : win){
            System.out.println(i);
        }
        for(int i: win_nums){
            win.add(i);
        }
        int zero=0;
        int cnt=0;
        for(int i : lottos){
            if(i == 0){
                zero++;
            } else if(win.contains(i)){
                cnt++;
            }
        }
        answer[0] = rank[zero+cnt];
        answer[1] = rank[cnt];
        return answer;
    }
}
