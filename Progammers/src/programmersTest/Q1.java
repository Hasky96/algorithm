package programmersTest;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] grade = {3,2,3,6,4,5};
//        int[] grade = {6,5,4,3,2,1};
        System.out.println(solution(grade));
    }

    public static int solution(int[] grade) {
        int answer = 0;

        for(int i = grade.length-1; i>0;i--){
            if(grade[i] < grade[i-1]){
                answer+= grade[i-1]-grade[i];
                grade[i-1] = grade[i];
            }
        }
        return answer;
    }
}
