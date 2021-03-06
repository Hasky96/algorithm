package problems;

import java.util.Arrays;
import java.util.PriorityQueue;


public class 실패율 {
    public static void main(String[] args) {
        int N = 10;
        int[] stages = {5,5,5,5,5,5,5,5};
        System.out.println(Arrays.toString(solution(N, stages)));
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] userStage = new double[N+1];
//        Arrays.fill(userStage, 0);
        Arrays.sort(stages);// 오름차순 정렬
        int user = stages.length;
        int players = 0;
        int unclearPlayer = 0;
        for(int i=user-1;i>=0;i--){
            players++;
            if (stages[i] > N) {
                userStage[N] = (double) unclearPlayer/players;
                continue;
            }
            else if(stages[i] == N){
                unclearPlayer++;
                userStage[N] = (double) unclearPlayer/players;
            }
            else{
                userStage[N] = (double) unclearPlayer/(players);
                N = stages[i];
                unclearPlayer = 1;
            }
            if (i==0){
                userStage[N] = (double) unclearPlayer/(players);
            }
        }
        PriorityQueue<Qstage> Q = new PriorityQueue<>();
        for(int i = 1; i<userStage.length; i++){
            Q.add(new Qstage(i, userStage[i]));
        }
        int idx = 0;
        while(!Q.isEmpty()){
            Qstage x = Q.poll();
            answer[idx++] = x.getStageNum();
        }
        return answer;
    }

    static class Qstage implements Comparable<Qstage>{
        private int stageNum;
        private double falure;
        //Comparable 제작하여 사용
        public Qstage(int stageNum, double falure) {
            this.stageNum = stageNum;
            this.falure = falure;
        }

        @Override
        public int compareTo(Qstage o) {
            if(this.falure == o.getFalure()){
                if (this.stageNum > o.getStageNum()) return 1;
                else return -1;
            }
            else{
                if(this.falure > o.getFalure()) return -1;
                else if(this.falure < o.getFalure()) return 1;
            }
            return 0;
        }

        public int getStageNum() {
            return stageNum;
        }

        public Double getFalure() {
            return falure;
        }
    }
}
/*
1 2 2 2 3 3 4 6
분모 0
분모 ++
분자 ++
0/1 // 5
1/2 // 4
1/3 // 3
2/4 // 3
1/5 // 2
2/6 // 2
3/7 // 2
1/8 // 1

* */