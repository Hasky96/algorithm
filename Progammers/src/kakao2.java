import java.util.*;

public class kakao2 {
    static int answer;

    static class QQ {
        Queue Q1 = new LinkedList();
        Queue Q2 = new LinkedList();
        int cnt = 0;

        QQ(int[] a, int[] b){
            for(int i:a){
                Q1.offer(i);
            }
            for(int i:b){
                Q2.offer(i);
            }
        }
        QQ(LinkedList q1, LinkedList q2){
            this.Q1 = q1;
            this.Q2 = q2;
        }

        void oneToTwo() {
            this.Q2.offer(this.Q1.poll());
        }
        void twoToOno() {
            this.Q1.offer(this.Q2.poll());
        }

        int getOne() {
            int sum = 0;

            for(Object a : Q1){
                sum += (int)a;
            }
            return sum;
        }
        int getTwo() {
            int sum = 0;

            for(Object a : Q2){
                sum += (int)a;
            }
            return sum;
        }
        int total(){
            return this.getOne()+this.getTwo();
        }

        QQ copy(){
            return new QQ((LinkedList) this.Q1, (LinkedList)this.Q2);
        }

    }


    public static void main(String[] args) {
        int[] queue1 = {3,2,7,2};
        int[] queue2 = {4,6,5,1};
        System.out.println(solution(queue1, queue2));
        System.out.println("============");
        int[] queue3 = {1,2,1,2};
        int[] queue4 = {1,10,1,2};
        answer = 6000001;
        System.out.println(solution(queue3, queue4));
        System.out.println("============");
        int[] queue5 = {1,1};
        int[] queue6 = {1,5};
        answer = 6000001;
        System.out.println(solution(queue5, queue6));
    }

    public static int solution(int[] queue1, int[] queue2) {
        answer = 6000001;
        QQ a = new QQ(queue1, queue2);
        int cut = queue1.length*2;
        dfs(a, 0, cut);
        if(answer==6000001) return -1;
        return answer;
    }

    public static void dfs(QQ qs, int level,int cut){
        level++;
        if(level == cut){
            return;
        }
        QQ temp = qs.copy();
        if(qs.Q1.isEmpty()){
        }else{
            qs.oneToTwo();
            if(qs.getOne() == qs.total()/2){
                answer = Math.min(answer, level+1);
                return;
            }
            dfs(qs, level, cut);
        }
        qs = temp;

        if(qs.Q2.isEmpty()){
        }else{
            qs.twoToOno();
            dfs(qs, level, cut);
        }
    }

}
